package historicalWeather;

public enum Cities {
	Munich("Munich","Bavaria",1185400),
	Nuremberg("Nuremberg","Bavaria",486700),
	Augsburg("Augsburg","Bavaria",253800),
	Bremen("Bremen","Bremen",527900),
	Stuttgart("Stuttgart","Baden-Württemberg",581100),
	Mannheim("Mannheim","Baden-Württemberg",306100),
	Karlsruhe("Karlsruhe","Baden-Württemberg",279600),
	Freiburg("Freiburg","Baden-Württemberg",206300),
	Hamburg("Hamburg","Hamburg",1686100),
	Frankfurt("Frankfurt","Hesse",648000),
	Wiesbaden("Wiesbaden","Hesse",269200),
	Kassel("Kassel","Hesse",193500),
	Hanover("Hanover","Lower Saxony",516300),
	Braunschweig("Braunschweig","Lower Saxony",243700),
	Osnabrück("Osnabrück","Lower Saxony",164000),
	Oldenburg("Oldenburg","Lower Saxony",157600),
	Rostock("Rostock","Mecklenburg-Vorpommern",192100),
	Cologne("Cologne","North Rhine-Westphalia",965300),
	Essen("Essen","North Rhine-Westphalia",588800),
	Dortmund("Dortmund","North Rhine-Westphalia",587600),
	Düsseldorf("Düsseldorf","North Rhine-Westphalia",568900),
	Duisburg("Duisburg","North Rhine-Westphalia",513400),
	Bochum("Bochum","North Rhine-Westphalia",388100),
	Wuppertal("Wuppertal","North Rhine-Westphalia",365400),
	Bielefeld("Bielefeld","North Rhine-Westphalia",320900),
	Bonn("Bonn","North Rhine-Westphalia",307500),
	Gelsenkirchen("Gelsenkirchen","North Rhine-Westphalia",276200),
	Münster("Münster","North Rhine-Westphalia",265900),
	Mönchengladbach("Mönchengladbach","North Rhine-Westphalia",264400),
	Aachen("Aachen","North Rhine-Westphalia",241300),
	Krefeld("Krefeld","North Rhine-Westphalia",238000),
	Oberhausen("Oberhausen","North Rhine-Westphalia",221700),
	Hagen("Hagen","North Rhine-Westphalia",201700),
	Hamm("Hamm","North Rhine-Westphalia",180300),
	Herne("Herne","North Rhine-Westphalia",174200),
	MülheimanderRuhr("Mülheim an der Ruhr","North Rhine-Westphalia",173000),
	Solingen("Solingen","North Rhine-Westphalia",164500),
	Leverkusen("Leverkusen","North Rhine-Westphalia",161700),
	Mainz("Mainz","Rhineland-Palatinate",186700),
	LudwigshafenamRhein("Ludwigshafen am Rhein","Rhineland-Palatinate",162000),
	Leipzig("Leipzig","Saxony",486100),
	Dresden("Dresden", "Saxony",473300),
	Chemnitz("Chemnitz","Saxony",255600),
	Erfurt("Erfurt","Thuringia",195000),
	Kiel("Kiel","Schleswig-Holstein",229900),
	Lübeck("Lübeck","Schleswig-Holstein",213400),
	Berlin("Berlin","Berlin",3275000),
	Saarbrücken("Saarbrücken","Saarland",180000),
	Halle("Halle","Saxony-Anhalt",237400),
	Magdeburg("Magdeburg","Saxony-Anhalt",224100);
	
	public final String englishName;
	public final String state;
	public int population;
	
	private Cities(String name,String state,int population){
		this.englishName = name;
		this.state = state;
		this.population = population;
	}
	
	
}
