package historicalWeather;

public enum Cities {
	Munich("Munich","Bavaria",1185400),
	Nuremberg("Nuremberg","Bavaria",486700),
	Augsburg("Augsburg","Bavaria",253800),
	Bremen("Bremen","Bremen",527900),
	Stuttgart("Stuttgart","BadenWürttemberg",581100),
	Mannheim("Mannheim","BadenWürttemberg",306100),
	Karlsruhe("Karlsruhe","BadenWürttemberg",279600),
	Freiburg("Freiburg","BadenWürttemberg",206300),
	Hamburg("Hamburg","Hamburg",1686100),
	Frankfurt("Frankfurt","Hesse",648000),
	Wiesbaden("Wiesbaden","Hesse",269200),
	Kassel("Kassel","Hesse",193500),
	Hanover("Hanover","LowerSaxony",516300),
	Braunschweig("Braunschweig","LowerSaxony",243700),
	Osnabrück("Osnabrück","LowerSaxony",164000),
	Oldenburg("Oldenburg","LowerSaxony",157600),
	Rostock("Rostock","MecklenburgVorpommern",192100),
	Cologne("Cologne","NorthRhineWestphalia",965300),
	Essen("Essen","NorthRhineWestphalia",588800),
	Dortmund("Dortmund","NorthRhineWestphalia",587600),
	Düsseldorf("Düsseldorf","NorthRhineWestphalia",568900),
	Duisburg("Duisburg","NorthRhineWestphalia",513400),
	Bochum("Bochum","NorthRhineWestphalia",388100),
	Wuppertal("Wuppertal","NorthRhineWestphalia",365400),
	Bielefeld("Bielefeld","NorthRhineWestphalia",320900),
	Bonn("Bonn","NorthRhineWestphalia",307500),
	Gelsenkirchen("Gelsenkirchen","NorthRhineWestphalia",276200),
	Münster("Münster","NorthRhineWestphalia",265900),
	Mönchengladbach("Mönchengladbach","NorthRhineWestphalia",264400),
	Aachen("Aachen","NorthRhineWestphalia",241300),
	Krefeld("Krefeld","NorthRhineWestphalia",238000),
	Oberhausen("Oberhausen","NorthRhineWestphalia",221700),
	Hagen("Hagen","NorthRhineWestphalia",201700),
	Herne("Herne","NorthRhineWestphalia",174200),
	Solingen("Solingen","NorthRhineWestphalia",164500),
	Leverkusen("Leverkusen","NorthRhineWestphalia",161700),
	Mainz("Mainz","RhinelandPalatinate",186700),
	Leipzig("Leipzig","Saxony",486100),
	Dresden("Dresden", "Saxony",473300),
	Chemnitz("Chemnitz","Saxony",255600),
	Erfurt("Erfurt","Thuringia",195000),
	Kiel("Kiel","SchleswigHolstein",229900),
	Lübeck("Lübeck","SchleswigHolstein",213400),
	Berlin("Berlin","Berlin",3275000),
	Saarbrücken("Saarbrücken","Saarland",180000),
	Halle("Halle","SaxonyAnhalt",237400),
	Magdeburg("Magdeburg","SaxonyAnhalt",224100);
	
	public final String englishName;
	public final String state;
	public int population;
	
	private Cities(String name,String state,int population){
		this.englishName = name;
		this.state = state;
		this.population = population;
	}
	
	
}
