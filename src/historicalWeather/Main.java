package historicalWeather;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		String currentPeriod = "";
		String fullCsv = "";
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

	
	private static Map<String,Integer> mapCitiesToPopulation(){
		Map<String,Integer> returnMap = new HashMap();
		for (State s: State.values()){
			int totalCitiesPopulation = 0;
			int cityCount = 0;
	
			for (Cities c: Cities.values()){
				if (s.name() == c.state){
					totalCitiesPopulation += c.population;
					cityCount+=1;
				}
			int populationWithoutCities = s.population - totalCitiesPopulation;
			returnMap.put(c.name(), c.population + (populationWithoutCities/cityCount));
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
