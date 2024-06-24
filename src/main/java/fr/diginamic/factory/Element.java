package fr.diginamic.factory;

public class Element {
	protected String nom;
	protected Double valeur;
	protected Unite unite;
	public Element(String nom, Double valeur, Unite unite) {
		this.nom = nom;
		this.valeur = valeur;
		this.unite = unite;
	}
	/** Getter pour nom
	 * @return the nom 
	*/
	public String getNom() {
		return nom;
	}
	/** Setter pour nom
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** Getter pour valeur
	 * @return the valeur 
	*/
	public Double getValeur() {
		return valeur;
	}
	/** Setter pour valeur
	 * @param valeur
	 */
	public void setValeur(Double valeur) {
		this.valeur = valeur;
	}
	/** Getter pour unite
	 * @return the unite 
	*/
	public Unite getUnite() {
		return unite;
	}
	/** Setter pour unite
	 * @param unite
	 */
	public void setUnite(Unite unite) {
		this.unite = unite;
	}


}
