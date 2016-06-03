package historicalWeather;


public enum State {
	BadenWürttemberg(10755000),
	Bavaria(12542000),
	Berlin(3469000),
	Brandenburg(2500000),
	Bremen(661000),
	Hamburg(1788000),
	Hesse(6066000),
	LowerSaxony(7914000),
	MecklenburgVorpommern(1639000),
	NorthRhineWestphalia(17837000),
	RhinelandPalatinate(3999000),
	Saarland(1018000),
	Saxony(4143000),
	SchleswigHolstein(2833000),
	Thuringia(2231000),
	SaxonyAnhalt(227000);
	
	public int population;
	
	private State(int population){
		this.population = population;
	}
	
	public int getTotalPopulation(){
		int returnValue = 0;
		for(State s: State.values()){
			returnValue += s.population;
		}
		return returnValue;
	}
	
}
