package historicalWeather;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		WeatherDescConst.initializeWeatherMapping();
		String currentPeriod = "";
		String fullCsv = "Date, MaxTempDay, MinTempDay, Hour, AverageTemp, WeatherCode";
		RequestHelper helper = new RequestHelper();
		try {
			Cities[] cityValues = Cities.values();
			String cityParam;
			for (Cities city : cityValues) {
				cityParam = "&q=" + city.englishName;
				for (String period : Constants.PERIODS) {
					currentPeriod = period;
					fullCsv += helper.excutePost(Constants.getTesturl() + cityParam + period, "", city.englishName, city.population);
					System.out.println("Period" + period);
					generateCsvFile("test.csv", fullCsv);
				}
			}
		} catch (Exception e) {
			System.out.println(currentPeriod);
			e.printStackTrace();
		}

	}

	private static void generateCsvFile(String sFileName, String csvText) {
		try {
			FileWriter writer = new FileWriter(sFileName);
			writer.append(csvText);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
