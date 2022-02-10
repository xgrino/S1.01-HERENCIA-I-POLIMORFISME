package exercici_5;

public class Animal {
	
	//CONSTRUCTOR
	public Animal() {
		
	}
	
	//MÈTODES SOBRECARREGATS
	
	public void correr() {
		System.out.println("Estic corrent.");
	}
	
	public void correr(double distancia) {
		System.out.println("Estic corrent " + distancia + "Km.");
		
	}
	
	public void correr(double distancia, String lloc) {
		System.out.println("Estic corrent " + distancia + "Km per " + lloc + ".");
	}
	

}
