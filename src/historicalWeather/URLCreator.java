package historicalWeather;

public class URLCreator {
	private String url = "http://api.worldweatheronline.com/premium/v1/past-weather.ashx?key=95c6e11b0b85470ab7983857162505%20&q=Munich&format=json&date=2012-04-01&enddate=2012-04-30";
	private String[] urls = {"http://api.worldweatheronline.com/premium/v1/past-weather.ashx?key=4635083e24f2413085f82611160306&q=Munich&format=json&date=2012-04-01&enddate=2012-04-30"};
	
	
	
	public static String getURL(String city,String startDate, String endDate){
		return Constants.getUrloffset() + Constants.getJsonformat() + startDate + endDate;
	}
	
	private static String getCity(){
		return " ";
	} 
	
	
	
}
