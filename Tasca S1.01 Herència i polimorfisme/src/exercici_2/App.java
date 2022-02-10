package exercici_2;

public class App {
	public static void main(String[] args) {

		Vehicle.parar();

		Vehicle v1 = new Vehicle("Nissan", "Qashqai", 4.425, 1.835, 1.625);
		v1.accelerar();

		Vehicle v2 = new Vehicle();
		v2.accelerar();

	}
}
