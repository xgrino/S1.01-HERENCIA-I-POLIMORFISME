package exercici_1;

public class App {
	public static void main(String[] args) {

		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("Ford", "Focus", 1.825, 4.378, 1.454);

		v1.iniciar();
		v2.iniciar();

	}
}
