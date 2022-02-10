package exercici_4;

public class App {
	public static void main(String[] args) {
		
		//Imaginem que hom tria un cotxe però després prefereix un altre model i color.
		
		Vehicle v1 = new Vehicle("blau", 4.425, 1.835, 1.625);
		
		System.out.println(v1.carFeatures());
		
		System.out.println("");
		
		v1.carModifiedFeatures("Gris", 3.855, 1.825, 1.605);
		
		System.out.println(v1.carFeatures());
		
		System.out.println("");
		
		//La fàbrica també pot oferir la gamma de vehicles elèctrics
		
		Vehicle.modifyEngine("Elèctric");
		
		System.out.println(v1.carFeatures());
		

	}
}
