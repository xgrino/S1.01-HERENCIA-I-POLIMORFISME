package exercici_3;

public class Vehicle {
	
	
	//BLOCS D'INICIALITZACI�
	static {
		System.out.println("C�rrega static");
	}
	
	{
		System.out.println("C�rrega inst�ncia");
	}
	
	//CONSTRUCTOR
	public Vehicle() {
		System.out.println("Aquest �s el constructor");
	}
	
	//M�TODES
	public void vehicleInstance() {
		System.out.println("Aquest m�tode �s d'inst�ncia");
	}
	
	public static void vehicleClass() {
		System.out.println("Aquest m�tode �s de classe");
	}

}
