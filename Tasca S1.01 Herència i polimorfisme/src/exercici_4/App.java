package exercici_4;

public class App {
	public static void main(String[] args) {
		
		//Imaginem que hom tria un cotxe per� despr�s prefereix un altre model i color.
		
		Vehicle v1 = new Vehicle("blau", 4.425, 1.835, 1.625);
		
		System.out.println(v1.carFeatures());
		
		System.out.println("");
		
		v1.carModifiedFeatures("Gris", 3.855, 1.825, 1.605);
		
		System.out.println(v1.carFeatures());
		
		System.out.println("");
		
		//La f�brica tamb� pot oferir la gamma de vehicles el�ctrics
		
		Vehicle.modifyEngine("El�ctric");
		
		System.out.println(v1.carFeatures());
		

	}
}
