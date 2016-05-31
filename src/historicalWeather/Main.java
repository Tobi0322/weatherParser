package historicalWeather;

public class Main {

	public static void main(String[] args){
		RequestHelper helper = new RequestHelper();
		helper.excutePost(Constants.getConstant(Constants.ConstantsE.URL),"");
		
		
	}
	
}
