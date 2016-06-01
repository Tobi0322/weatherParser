package historicalWeather;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import org.json.*;

public class RequestHelper {

	public static String excutePost(String targetURL, String urlParameters, String city, int noOfCustomers) {
		HttpURLConnection connection = null;
		String csvString = "";
		try {
			// Create connection
			URL url = new URL(targetURL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

			connection.setRequestProperty("Content-Length", Integer.toString(urlParameters.getBytes().length));
			connection.setRequestProperty("Content-Language", "en-US");

			connection.setUseCaches(false);
			connection.setDoOutput(true);

			// Send request
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.close();

			// Get Response
			InputStream is = connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			StringBuilder response = new StringBuilder(); // or StringBuffer if
															// not Java 5+
			String line;
			while ((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}
			rd.close();

			JSONObject object = new JSONObject(response.toString());
			JSONObject object2 = object.getJSONObject("data");
			JSONArray weather = object2.getJSONArray("weather");

			String maxTempC;
			String minTempC;
			String date;
			String hour;
			String hourTemp;
			String hourDesc;
			Integer hourCode;
			String dateParts[];
			for (int i = 0; i < weather.length(); i++) {
 				JSONObject dailyWeather = new JSONObject(weather.optString(i));
				JSONArray arr = dailyWeather.getJSONArray("hourly");
				minTempC = dailyWeather.getString("mintempC").toString();
				maxTempC = dailyWeather.getString("maxtempC").toString();
				date = dailyWeather.getString("date").toString();
				dateParts  = date.split("-");
				date = dateParts[2]+"."+dateParts[1]+"."+dateParts[0];
				for (int j = 0; j < arr.length(); j++) {
					JSONObject ovj = arr.getJSONObject(j);
					hour = ovj.getString("time");
					if(hour.length() ==3){
						hour = "0"+hour;
					}
					hour = hour.substring(0, 2)+":"+hour.substring(2, 4);
					hourTemp = ovj.getString("tempC");
					hourDesc = ovj.getJSONArray("weatherDesc").toString().split(":")[1].split("\"")[1];
					hourCode = WeatherDescCons.getHourCode(hourDesc);
					csvString += (date+","+maxTempC+","+minTempC+","+hour+","+hourTemp+","+hourCode+","+city+","+noOfCustomers+"\n");

				}
			}
			return csvString;
		} catch (Exception e) {
			return e.toString();
		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
	}

	private static Date getDateFromString(String date) {
		String[] dateSplit = date.split(".");
		Date dateReturn = new Date(Integer.parseInt(dateSplit[2]), Integer.parseInt(dateSplit[1]),
				Integer.parseInt(dateSplit[0]));
		return dateReturn;
	}

}
