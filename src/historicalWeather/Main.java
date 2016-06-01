package historicalWeather;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		WeatherDescConst.initializeWeatherMapping();
		String currentPeriod = "";
		String fullCsv = "Date, MaxTempDay, MinTempDay, Hour, AverageTemp, WeatherCode";
		RequestHelper helper = new RequestHelper();
		try {
			for (String period : Constants.PERIODS) {
				currentPeriod = period;
				fullCsv += helper.excutePost(Constants.getTesturl() + period, "");
				generateCsvFile("test.csv", fullCsv);
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
