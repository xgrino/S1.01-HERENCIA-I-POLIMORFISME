package exercici_4;

public class Vehicle {

	// PROPIETATS
	private final static String carFactoryCity = "Barcelona";
	private static String engineType = "H�brid";
	private final String carTraction;
	private String carColour;
	private double carLength;
	private double carWidth;
	private double carHeigth;

	// CONSTRUCTOR

	public Vehicle(String carColour, double carLength, double carWidth, double carHeigth) {
		
		/*Imaginem que tots els vehicles es fabriquen a Barcelona i actualment nom�s ofereixen de tracci� 4x2. 
		El motor de base �s h�brid per� es pot modificar com la resta de caracter�stiques .*/

		carTraction = "4x2";
		this.carColour  = carColour;
		this.carLength = carLength;
		this.carWidth = carWidth;
		this.carHeigth = carHeigth;

	}
	
	//M�TODES
	
	public String carFeatures() {
		String carFeaturesDescription = "Aquest cotxe fabricat a " + carFactoryCity + " t� un motor " + engineType + " de tracci� " +  carTraction + ".\n"
				+ "El seu color �s " + carColour + " i llurs dimensions s�n: L " + carLength + "cm, W " + carWidth + "cm, H " + carHeigth + "cm.";
		
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

