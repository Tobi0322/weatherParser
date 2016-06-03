package historicalWeather;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.ObjectView;

import org.json.*;

public class RequestHelper {

	public static DataCollection excutePost(String targetURL, String urlParameters, String city, int noOfCustomers) {
		HttpURLConnection connection = null;
		String csvString = "";
		
		try {
			// Create connection
			URL url = new URL(targetURL +"&q=" +city +Constants.JSONFORMAT +urlParameters );
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
			
			DataCollection collection = new DataCollection();
			
			
			//Average Temp Day
			for (int i = 0; i < weather.length(); i++) {
				
				
 				JSONObject dailyWeather = new JSONObject(weather.optString(i));
				JSONArray arr = dailyWeather.getJSONArray("hourly");
				minTempC = dailyWeather.getString("mintempC").toString();
				maxTempC = dailyWeather.getString("maxtempC").toString();
				date = dailyWeather.getString("date").toString();
				dateParts  = date.split("-");
				date = dateParts[2]+"."+dateParts[1]+"."+dateParts[0];
				for (int j = 0; j < arr.length(); j++) {
					DataObject object1 = new DataObject();
					JSONObject ovj = arr.getJSONObject(j);
					hour = ovj.getString("time");
					if(hour.length() ==3){
						hour = "0"+hour;
					}
					
					hour = hour.substring(0, 2)+":"+hour.substring(2, 4);
					hourTemp = ovj.getString("tempC");
					hourDesc = ovj.getJSONArray("weatherDesc").toString().split(":")[1].split("\"")[1];
					hourCode = WeatherDescCons.getHourCode(hourDesc);
					
					object1.setDate(date);
					object1.setHour(hour);
					object1.setMaxTempC(maxTempC);
					object1.setMinTempC(minTempC);
					object1.setHourTemp(hourTemp);
					object1.setCity(city);
					object1.setNumberOfCustomers(noOfCustomers);
					try{
						int izi = WeatherDescCons.weatherMapping.get(hourDesc.toLowerCase().trim());
					}
					catch(NullPointerException e){
						System.out.println(hourDesc.toLowerCase().trim());
					}
					object1.setEffect((mapCitiesToPopulation().get(city)));
					collection.getOneMonthData().add(object1);
					
					// csvString += (date+","+maxTempC+","+minTempC+","+hour+","+hourTemp+","+hourCode+","+city+","+noOfCustomers +(mapCitiesToPopulation().get(city)*WeatherDescCons.weatherMapping.get(hourDesc))+"\n");

				}
			}
			DataObject[] a = collection.getOneMonthData().toArray(new DataObject[collection.getOneMonthData().size()]);
			return collection;
		} catch (Exception e) {
			e.printStackTrace();;
			return null;
		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
	}
	
	private static Map<String, Integer> mapCitiesToPopulation() {
		Map<String, Integer> returnMap = new HashMap();
		for (State s : State.values()) {
			int totalCitiesPopulation = 0;
			int cityCount = 0;

			for (Cities c : Cities.values()) {
				if (s.name() == c.state) {
					totalCitiesPopulation += c.population;
					cityCount += 1;
				}
			}
			
			for(Cities c : Cities.values()){
				if (s.name() == c.state){
					int populationWithoutCities = s.population - totalCitiesPopulation;
					returnMap.put(c.name(), c.population + (populationWithoutCities / cityCount));
				}
			}
		}
		return returnMap;
	}

	private static Date getDateFromString(String date) {
		String[] dateSplit = date.split(".");
		Date dateReturn = new Date(Integer.parseInt(dateSplit[2]), Integer.parseInt(dateSplit[1]),
				Integer.parseInt(dateSplit[0]));
		return dateReturn;
	}
	
	private String maxTempC;
	private String minTempC;
	private String date;
	private String hour;
	private String hourTemp;
	private String hourDesc;
	private Integer hourCode;
	private String dateParts[];
	private String city;
	private int numberOfCustomers;
	private int effect;
	DataObject[] obj;
	
	//Param is the start and the end
	public static DataCollection getCollectionForAllCitiesTogether(String param){
		ArrayList<DataCollection> cityCollections = new ArrayList<DataCollection>();
		
		
		for(Cities c : Cities.values()){
			cityCollections.add(excutePost(Constants.getUrloffset(), param, c.englishName , c.population));
		}


		
		DataCollection returnCollection = new DataCollection();
		
		for(int i = 0; i < cityCollections.get(0).getOneMonthData().size() ; i++){
			DataObject obj = new DataObject();
			float maxTempC = 0;
			float minTempC = 0;
			String date = cityCollections.get(0).getOneMonthData().iterator().next().getDate();
			String hour = cityCollections.get(0).getOneMonthData().iterator().next().getHour();
			float shourTemp = 0;
			String desc = "Not available";
			int numberofCustomers = 0;
			int effect = 0;
			
			for(DataCollection col: cityCollections){
				DataObject tmp = col.getOneMonthData().toArray(new DataObject[col.getOneMonthData().size()])[i];
				maxTempC += Float.parseFloat(tmp.getMaxTempC()) * tmp.getNumberOfCustomers();
				minTempC += Float.parseFloat(tmp.getMinTempC()) * tmp.getNumberOfCustomers();
				shourTemp += Integer.parseInt(tmp.getHourTemp()) * tmp.getNumberOfCustomers();
				effect += tmp.getEffect();
				date = tmp.getDate();
				hour = tmp.getHour();
				numberofCustomers += tmp.getNumberOfCustomers();
			}
			int totalNumber = 0;
			
			for(Cities c : Cities.values()){
				totalNumber += c.population;
			}
			DecimalFormat df = new DecimalFormat("#.##");
			obj.setCity("Germany");
			obj.setDate(date);
			obj.setEffect(effect);
			obj.setHour(hour);
			obj.setHourTemp(df.format(shourTemp/totalNumber));
			obj.setHourDesc(desc);
			obj.setNumberOfCustomers(numberofCustomers);
			obj.setMinTempC(df.format(minTempC/totalNumber));
			obj.setMaxTempC(df.format(maxTempC/totalNumber));
			
			returnCollection.getOneMonthData().add(obj);
		}
		
		return returnCollection;
		
		
		
	}

	public String createCsvString(DataObject object) {
		String returnString = object.getDate() +"," +object.getMaxTempC() +"," +object.getMinTempC() + "," +object.getHour() +"," +object.getHourTemp() +"," +object.getEffect() +"\n";
		return returnString;
	}
	
	

	
	
	

}
