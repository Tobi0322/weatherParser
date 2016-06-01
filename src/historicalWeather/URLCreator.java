package historicalWeather;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class URLCreator {
	private String url = "http://api.worldweatheronline.com/premium/v1/past-weather.ashx?key=95c6e11b0b85470ab7983857162505%20&q=Munich&format=json&date=2012-04-01&enddate=2012-04-30";
	private Set urls = new LinkedHashSet<String>();
	
	
	
	private static String getCity(Cities city){
		return city.name();
	} 
	/*
	 * Start and end time in the format JJJJ-MM-DDDD
	 */
	public Set generateUls(String start,String end){
		urls.clear();
		for (Cities cit : Cities.values()){
			String URL = Constants.getUrloffset() +"&q=" +cit.name() +Constants.getJsonformat() + "&date=" +start + "&enddate=" +end;
			urls.add(URL);
		}
		return urls;
	}
}
