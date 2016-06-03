package historicalWeather;

public class DataObject {
	public int getEffect() {
		return effect;
	}
	public void setEffect(int effect) {
		this.effect = effect;
	}
	private String maxTempC;
	private String minTempC;
	private String date;
	private String hour;
	private String hourTemp;
	private String hourDesc;
	private Integer hourCode;
	private String dateParts[];
	private String city;
	private int numberOfCustomers;
	private int effect;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	public void setNumberOfCustomers(int numberOfCustomers) {
		this.numberOfCustomers = numberOfCustomers;
	}
	public String getMaxTempC() {
		return maxTempC;
	}
	public void setMaxTempC(String maxTempC) {
		this.maxTempC = maxTempC;
	}
	public String getMinTempC() {
		return minTempC;
	}
	public void setMinTempC(String minTempC) {
		this.minTempC = minTempC;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public String getHourTemp() {
		return hourTemp;
	}
	public void setHourTemp(String hourTemp) {
		this.hourTemp = hourTemp;
	}
	public String getHourDesc() {
		return hourDesc;
	}
	public void setHourDesc(String hourDesc) {
		this.hourDesc = hourDesc;
	}
	public Integer getHourCode() {
		return hourCode;
	}
	public void setHourCode(Integer hourCode) {
		this.hourCode = hourCode;
	}
	public String[] getDateParts() {
		return dateParts;
	}
	public void setDateParts(String[] dateParts) {
		this.dateParts = dateParts;
	}

}
