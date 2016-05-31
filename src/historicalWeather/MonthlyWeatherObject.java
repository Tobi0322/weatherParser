package historicalWeather;

import java.util.ArrayList;
import java.util.List;

public class MonthlyWeatherObject {
	private List<DailyWeatherObject> days = new ArrayList<DailyWeatherObject>();

	public List<DailyWeatherObject> getDays() {
		return days;
	}

	public void setDays(List<DailyWeatherObject> days) {
		this.days = days;
	}
	
}
