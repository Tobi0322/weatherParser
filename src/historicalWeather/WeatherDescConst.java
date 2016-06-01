package historicalWeather;

import java.util.HashMap;

public class WeatherDescConst {

	public static String BLIZZARD = "Blizzard";
	public static String BLOWING_SNOW = "Blowing snow";
	public static String CLEAR = "Clear";
	public static String CLOUDY = "Cloudy";
	public static String FOG = "Fog";
	public static String FREEZING_DRIZZLE = "Freezing drizzle";
	public static String FREEZING_FOG = "Freezing fog";
	public static String HEAVY_FREEZING_DRIZZLE = "Heavy freezing drizzle";
	public static String HEAVY_RAIN = "Heavy rain";
	public static String HEAVY_RAIN_AT_TIMES = "Heavy rain at times";
	public static String HEAVY_SNOW = "Heavy snow";
	public static String LIGHT_FREEZING_DRIZZLE = "Light freezing drizzle";
	public static String LIGHT_RAIN = "Light rain";
	public static String LIGHT_DRIZZLE = "Light drizzle";
	public static String LIGHT_FREEZING_RAIN = "Light freezing rain";
	public static String LIGHT_RAIN_SHOWER = "Light rain shower";
	public static String LIGHT_SLEET = "Light sleet";
	public static String LIGHT_SLEET_SHOWERS = "Light sleet showers";
	public static String LIGHT_SNOW = "Light snow";
	public static String LIGHT_SNOW_SHOWERS = "Light snow showers";
	public static String MIST = "Mist";
	public static String MODERATE_RAIN = "Moderate Rain";
	public static String MODERATE_SNOW = "Moderate Snow";
	public static String MODERATE_OR_HEAVY_RAIN_THUNDER = "Moderate or heavy rain in area with thunder";
	public static String MODERATE_HEAVY_SLEET = "Moderate or heavy sleet";
	public static String MODERATE_RAIN_AT_TIMES = "Moderate rain at times";
	public static String MODERATE_HEAVY_RAIN_SHOWER = "Moderate or heavy rain shower";
	public static String PATCHY_MODERATE_SNOW = "Patchy moderate snow";
	public static String OVERACAST = "Overcast";
	public static String PARTLY_CLOUDY = "Partly cloudy";
	public static String SUNNY = "Sunny";
	public static String TORRENTIAL_RAIN_SHOWER = "Torrential rain shower";
	public static String THUNDERY_OUTBREAKS_NEARBY = "Thundery outbreaks in nearby";
	public static String PATCHY_SNOW_NEARBY = "Patchy snow nearby";
	public static String PATCHY_SLEET_NEARBY = "Patchy sleet nearby";
	public static String PATCHY_RAIN_NEARBY = "Patchy rain nearby";
	public static String PATCHY_LIGHT_SNOW = "Patchy light snow";
	public static String PATCHY_LIGHT_RAIN = "Patchy light rain";
	public static String PATCHY_LIGHT_DRIZZLE = "Patchy light drizzle";
	public static String PATCHY_HEAVY_SNOW = "Patchy heavy snow";
	public static String PATCHY_LIGHT_RAIN_WITH_THUNDER = "patchy light rain in area with thunder";
	public static String MODERATE_HEAVY_RAIN_WITH_THUNDER = "Moderate or heavy snow in area with thunder";
	public static String MODERATE_HEAVY_SNOW_SHOWERS = "Moderate or heavy snow showers";

	
	public static HashMap<String, Integer> weatherMapping = new HashMap<String, Integer>();
	
	public static void initializeWeatherMapping(){
		weatherMapping.put(BLIZZARD.toLowerCase().trim(), 10);
		weatherMapping.put(BLOWING_SNOW.toLowerCase().trim(), 8);
		weatherMapping.put(CLEAR.toLowerCase().trim(), 2);
		weatherMapping.put(CLOUDY.toLowerCase().trim(), 4);
		weatherMapping.put(FOG.toLowerCase().trim(), 6);
		weatherMapping.put(FREEZING_DRIZZLE.toLowerCase().trim(), 8);
		weatherMapping.put(LIGHT_RAIN_SHOWER.toLowerCase().trim(), 6);
		weatherMapping.put(FREEZING_FOG.toLowerCase().trim(), 6);
		weatherMapping.put(HEAVY_FREEZING_DRIZZLE.toLowerCase().trim(), 9);
		weatherMapping.put(HEAVY_RAIN.toLowerCase().trim(), 8);
		weatherMapping.put(HEAVY_RAIN_AT_TIMES.toLowerCase().trim(), 6);
		weatherMapping.put(HEAVY_SNOW.toLowerCase().trim(), 5);
		weatherMapping.put(LIGHT_FREEZING_DRIZZLE.toLowerCase().trim(), 6);
		weatherMapping.put(LIGHT_DRIZZLE.toLowerCase().trim(), 6);
		weatherMapping.put(LIGHT_FREEZING_RAIN.toLowerCase().trim(), 6);
		weatherMapping.put(LIGHT_RAIN.toLowerCase().trim(), 5);
		weatherMapping.put(LIGHT_SLEET.toLowerCase().trim(), 6);
		weatherMapping.put(LIGHT_SLEET_SHOWERS.toLowerCase().trim(), 5);
		weatherMapping.put(LIGHT_SNOW.toLowerCase().trim(), 3);
		weatherMapping.put(LIGHT_SNOW_SHOWERS.toLowerCase().trim(), 2);
		weatherMapping.put(MIST.toLowerCase().trim(), 6);
		weatherMapping.put(MODERATE_RAIN.toLowerCase().trim(), 7);
		weatherMapping.put(MODERATE_HEAVY_RAIN_SHOWER.toLowerCase().trim(), 7);
		weatherMapping.put(MODERATE_HEAVY_SLEET.toLowerCase().trim(), 7);
		weatherMapping.put(MODERATE_SNOW.toLowerCase().trim(), 6);
		weatherMapping.put(MODERATE_OR_HEAVY_RAIN_THUNDER.toLowerCase().trim(), 8);
		weatherMapping.put(MODERATE_RAIN_AT_TIMES.toLowerCase().trim(), 6);
		weatherMapping.put(MODERATE_HEAVY_SNOW_SHOWERS.toLowerCase().trim(), 7);
		weatherMapping.put(PATCHY_MODERATE_SNOW.toLowerCase().trim(), 8);
		weatherMapping.put(PATCHY_SNOW_NEARBY.toLowerCase().trim(), 5);
		weatherMapping.put(PATCHY_SLEET_NEARBY.toLowerCase().trim(), 3);
		weatherMapping.put(PATCHY_RAIN_NEARBY.toLowerCase().trim(), 7);
		weatherMapping.put(PATCHY_LIGHT_SNOW.toLowerCase().trim(), 5);
		weatherMapping.put(PATCHY_LIGHT_RAIN.toLowerCase().trim(), 5);
		weatherMapping.put(PATCHY_LIGHT_DRIZZLE.toLowerCase().trim(), 3);
		weatherMapping.put(PATCHY_HEAVY_SNOW.toLowerCase().trim(), 7);
		weatherMapping.put(PATCHY_LIGHT_RAIN_WITH_THUNDER.toLowerCase().trim(), 8);
		weatherMapping.put(MODERATE_HEAVY_RAIN_WITH_THUNDER.toLowerCase().trim(), 10);
		weatherMapping.put(MODERATE_HEAVY_SNOW_SHOWERS.toLowerCase().trim(), 6);
		weatherMapping.put(OVERACAST.toLowerCase().trim(), 5);
		weatherMapping.put(PARTLY_CLOUDY.toLowerCase().trim(), 4);
		weatherMapping.put(SUNNY.toLowerCase().trim(), 1);
		weatherMapping.put(TORRENTIAL_RAIN_SHOWER.toLowerCase().trim(), 3);
		weatherMapping.put(THUNDERY_OUTBREAKS_NEARBY.toLowerCase().trim(), 8);
	}
	public static int getHourCode(String hourDesc) {
		try {
			return weatherMapping.get(hourDesc.toLowerCase().trim());
		} catch (Exception e) {
			System.out.println("Couldn't find in Map " +hourDesc.toLowerCase().trim());
			return 5;
		}
	}

}
