package exercici_8;

public class Frog extends Amphibian{
	
	//MÈTODES SOBREESCRITS
	public void moure() {
		System.out.println("Em moc vora el riu, l'estany o el llac.");
	}
	
	public void respirar() {
		System.out.println("La meva respiració és pulmonar però quan sóc petit tinc brànquies.");
	}
	
	public void menjar() {
		System.out.println("Menjo insectes, cargols i llimacs i m'agrada raucar.");
	}
	
	//MÈTODE
	public void saltar() {
		System.out.println("M'agrada saltar de fulla en fulla.");
	}
}

