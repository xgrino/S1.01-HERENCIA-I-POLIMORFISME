package exercici_8;

public class Frog extends Amphibian{
	
	//M�TODES SOBREESCRITS
	public void moure() {
		System.out.println("Em moc vora el riu, l'estany o el llac.");
	}
	
	public void respirar() {
		System.out.println("La meva respiraci� �s pulmonar per� quan s�c petit tinc br�nquies.");
	}
	
	public void menjar() {
		System.out.println("Menjo insectes, cargols i llimacs i m'agrada raucar.");
	}
	
	//M�TODE
	public void saltar() {
		System.out.println("M'agrada saltar de fulla en fulla.");
	}
}

