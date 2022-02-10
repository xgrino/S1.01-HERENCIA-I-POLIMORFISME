package exercici_3;

public class Vehicle {
	
	
	//BLOCS D'INICIALITZACIÓ
	static {
		System.out.println("Càrrega static");
	}
	
	{
		System.out.println("Càrrega instància");
	}
	
	//CONSTRUCTOR
	public Vehicle() {
		System.out.println("Aquest és el constructor");
	}
	
	//MÈTODES
	public void vehicleInstance() {
		System.out.println("Aquest mètode és d'instància");
	}
	
	public static void vehicleClass() {
		System.out.println("Aquest mètode és de classe");
	}

}
