package fr.diginamic.factory;

public enum Unite {
	/**Enumeration représentant 
	*/
	MICROGRAMMES("Microgrammes"),
	MILLIGRAMMES("Milligrammes"),
	GRAMMES("Grammes"),
	KG("Killogrammes");

	private String libelle;

	/**Constructeur
	 * @param libelle
	 */
	private Unite(String libelle) {
		this.libelle = libelle;
	}

	/** Getter pour libelle
	 * @return the libelle 
	*/
	public String getLibelle() {
		return libelle;
	}
	
}
