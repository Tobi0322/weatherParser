package historicalWeather;

public class Constants {

	private static String KEYS = "";
	private static final String TESTURL = "http://api.worldweatheronline.com/premium/v1/past-weather.ashx?key=95c6e11b0b85470ab7983857162505%20&q=Munich&format=json&date=2012-04-01&enddate=2012-04-30";
	private static final String JSONFORMAT = "&format=json";
	private static final String URLOFFSET = "http://api.worldweatheronline.com/premium/v1/past-weather.ashx?key=95c6e11b0b85470ab7983857162505%20";
	
	public static String getKeys() {
		return KEYS;
	}
	public static String getJsonformat() {
		return JSONFORMAT;
	}
	
	public static String getKEYS() {
		return KEYS;
	}
	public static void setKEYS(String kEYS) {
		KEYS = kEYS;
	}
	public static String getUrloffset() {
		return URLOFFSET;
	}
	public static String getTesturl() {
		return TESTURL;
	}

	}







