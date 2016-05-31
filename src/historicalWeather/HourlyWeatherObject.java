package historicalWeather;

public class HourlyWeatherObject {
	private double tempC;
	private String weatherDesc;
	private int hour;
	
	
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public double getTempC() {
		return tempC;
	}
	public void setTempC(double tempC) {
		this.tempC = tempC;
	}
	public String getWeatherDesc() {
		return weatherDesc;
	}
	public void setWeatherDesc(String weatherDesc) {
		this.weatherDesc = weatherDesc;
	}

	
	

}
