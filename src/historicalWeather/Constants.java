package historicalWeather;

public class Constants {
	private static final String KEYS = "";
	private static final String URLS = "http://api.worldweatheronline.com/premium/v1/past-weather.ashx?key=95c6e11b0b85470ab7983857162505%20&q=Munich&format=json&date=2012-04-01&enddate=2012-04-30";
	
	
	
	
	public enum ConstantsE {
		KEY, ADRESS, MODE, URL
	}
	
	public static String getConstant(ConstantsE c){
		switch(c){
		case URL: return URLS;
		default: return "";
		}
	}
	
	
	
}



