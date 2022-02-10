package exercici_1;

public class Vehicle {

	// PROPIETATS
	private String carBrand;
	private String carModel;
	private double carLength;
	private double carWidth;
	private double carHeigth;

	// CONSTRUCTORS
	public Vehicle() {

	}

	public Vehicle(String carBrand, String carModel, double carLength, double carWidth, double carHeigth) {

		this.carBrand = carBrand;
		this.carModel = carModel;
		this.carLength = carLength;
		this.carWidth = carWidth;
		this.carHeigth = carHeigth;

	}
	
	public void iniciar() {
		System.out.println("Aquest és un mètode de la classe Vehicle.");
	}

}
