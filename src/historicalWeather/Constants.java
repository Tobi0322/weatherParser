package historicalWeather;

public class Constants {

	public static String KEYS = "";
	public static final String TESTURL = "http://api.worldweatheronline.com/premium/v1/past-weather.ashx?key=95c6e11b0b85470ab7983857162505%20&q=Munich&format=json";
	public static final String JSONFORMAT = "&format=json";
	public static final String URLOFFSET = "http://api.worldweatheronline.com/premium/v1/past-weather.ashx?key=95c6e11b0b85470ab7983857162505%20";
	public static final String[] PERIODS = { "&date=2013-01-01&enddate=2013-01-31",
			"&date=2013-02-01&enddate=2013-02-28", "&date=2013-03-01&enddate=2013-03-31",
			"&date=2013-04-01&enddate=2013-04-30", "&date=2013-05-01&enddate=2013-05-31",
			"&date=2013-06-01&enddate=2013-06-30", "&date=2013-07-01&enddate=2013-07-31",
			"&date=2013-08-01&enddate=2013-08-31", "&date=2013-09-01&enddate=2013-09-30",
			"&date=2013-10-01&enddate=2013-10-31", "&date=2013-11-01&enddate=2013-11-30",
			"&date=2013-12-01&enddate=2013-12-31", "&date=2014-01-01&enddate=2014-01-31",
			"&date=2014-02-01&enddate=2014-02-28", "&date=2014-03-01&enddate=2014-03-31",
			"&date=2014-04-01&enddate=2014-04-30", "&date=2014-05-01&enddate=2014-05-31",
			"&date=2014-06-01&enddate=2014-06-30", "&date=2014-07-01&enddate=2014-07-31",
			"&date=2014-08-01&enddate=2014-08-31", "&date=2014-09-01&enddate=2014-09-30",
			"&date=2014-10-01&enddate=2014-10-31", "&date=2014-11-01&enddate=2014-11-30",
			"&date=2014-12-01&enddate=2014-12-31", "&date=2015-01-01&enddate=2015-01-31",
			"&date=2015-02-01&enddate=2015-02-28", "&date=2015-03-01&enddate=2015-03-31",
			"&date=2015-04-01&enddate=2015-04-30", "&date=2015-05-01&enddate=2015-05-31",
			"&date=2015-02-01&enddate=2015-02-28", "&date=2015-03-01&enddate=2015-03-31",
			"&date=2015-04-01&enddate=2015-04-30", "&date=2015-05-01&enddate=2015-05-31",
			"&date=2015-06-01&enddate=2015-06-30", "&date=2015-07-01&enddate=2015-07-31",
			"&date=2015-08-01&enddate=2015-08-31", "&date=2015-09-01&enddate=2015-09-30",
			"&date=2015-10-01&enddate=2015-10-31", "&date=2015-11-01&enddate=2015-11-30",
			"&date=2015-12-01&enddate=2015-12-31", "&date=2016-01-01&enddate=2016-01-31",
			"&date=2016-02-01&enddate=2016-02-28", "&date=2016-03-01&enddate=2016-03-31",
			"&date=2016-04-01&enddate=2016-04-30", "&date=2016-05-01&enddate=2016-05-31"

	
	};

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
