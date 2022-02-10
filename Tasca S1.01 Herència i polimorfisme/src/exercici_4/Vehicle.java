package exercici_4;

public class Vehicle {

	// PROPIETATS
	private final static String carFactoryCity = "Barcelona";
	private static String engineType = "Híbrid";
	private final String carTraction;
	private String carColour;
	private double carLength;
	private double carWidth;
	private double carHeigth;

	// CONSTRUCTOR

	public Vehicle(String carColour, double carLength, double carWidth, double carHeigth) {
		
		/*Imaginem que tots els vehicles es fabriquen a Barcelona i actualment només ofereixen de tracció 4x2. 
		El motor de base és híbrid però es pot modificar com la resta de característiques .*/

		carTraction = "4x2";
		this.carColour  = carColour;
		this.carLength = carLength;
		this.carWidth = carWidth;
		this.carHeigth = carHeigth;

	}
	
	//MÈTODES
	
	public String carFeatures() {
		String carFeaturesDescription = "Aquest cotxe fabricat a " + carFactoryCity + " té un motor " + engineType + " de tracció " +  carTraction + ".\n"
				+ "El seu color és " + carColour + " i llurs dimensions són: L " + carLength + "cm, W " + carWidth + "cm, H " + carHeigth + "cm.";
		
		return carFeaturesDescription;
				
	}

	public void carModifiedFeatures(String carColour, double carLength, double carWidth, double carHeigth) {
		this.carColour = carColour;
		this.carColour  = carColour;
		this.carLength = carLength;
		this.carWidth = carWidth;
		this.carHeigth = carHeigth;
		
	}
	
	public static void modifyEngine(String newEngineType) {
		engineType = newEngineType;
	}


}

