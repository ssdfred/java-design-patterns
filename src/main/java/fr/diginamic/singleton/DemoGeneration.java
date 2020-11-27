package fr.diginamic.singleton;

public class DemoGeneration {

	public static void main(String[] args) {
		
		BulletinSalaire bs = new BulletinSalaire("Untel", "Bob", 2337.5);
		
		SystemeGestion sg = new SystemeGestion();
		sg.genererPdf(bs, "C:/Temp/bulletin_salaire.pdf");
	}

}
