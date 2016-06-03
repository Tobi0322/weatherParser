package historicalWeather;

import java.util.LinkedHashSet;
import java.util.Set;

public class DataCollection {
	private Set<DataObject> oneMonthData = new LinkedHashSet<>();
	
	public Set<DataObject> getOneMonthData() {
		return oneMonthData;
	}

	public void setOneMonthData(Set<DataObject> oneMonthData) {
		this.oneMonthData = oneMonthData;
	}

	
}
