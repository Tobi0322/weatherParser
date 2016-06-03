package historicalWeather;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		WeatherDescCons.initializeWeatherMapping();
		RequestHelper helper = new RequestHelper();
		DataCollection col = helper.getCollectionForAllCitiesTogether(Constants.PERIODS[7]);
		DataObject[] oneMonth = col.getOneMonthData().toArray(new DataObject[col.getOneMonthData().size()]);
		System.out.println(oneMonth + col.toString());
		
		
		
		
	String currentPeriod = "";
	String fullCsv = "Date, MaxTempDay, MinTempDay, Hour, AverageTemp, Effect \n";
	
	try {
		Cities[] cityValues = Cities.values();
			String cityParam;
			
			
				//for (String period : Constants.PERIODS){
					DataCollection collection = helper.getCollectionForAllCitiesTogether(Constants.PERIODS[7]);
					for (DataObject obj: collection.getOneMonthData()){
						fullCsv += helper.createCsvString(obj);
						System.out.println("PERIOD" +Constants.PERIODS[7] +obj.getDate());
						
				//}
				generateCsvFile("WeatherData.csv", fullCsv);
				}
		} catch (Exception e) {
			System.out.println(currentPeriod);
			e.printStackTrace();
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
				int populationWithoutCities = s.population - totalCitiesPopulation;
				returnMap.put(c.name(), c.population + (populationWithoutCities / cityCount));
			}
		}
		return returnMap;
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
