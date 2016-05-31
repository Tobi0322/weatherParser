package historicalWeather;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DailyWeatherObject {

	public Date date;
	public double maxTemp;
	public double minTemp;
	public Date sunrise;
	public Date sundown;
	private List<HourlyWeatherObject> hourlyWeatherObjects = new ArrayList<HourlyWeatherObject>();
	

	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(double maxTemp) {
		this.maxTemp = maxTemp;
	}

	public double getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(double minTemp) {
		this.minTemp = minTemp;
	}

	public Date getSunrise() {
		return sunrise;
	}

	public void setSunrise(Date sunrise) {
		this.sunrise = sunrise;
	}

	public Date getSundown() {
		return sundown;
	}

	public void setSundown(Date sundown) {
		this.sundown = sundown;
	}

	public List<HourlyWeatherObject> getHourlyWeatherObjects() {
		return hourlyWeatherObjects;
	}

	public void setHourlyWeatherObjects(List<HourlyWeatherObject> hourlyWeatherObjects) {
		this.hourlyWeatherObjects = hourlyWeatherObjects;
	}

}
