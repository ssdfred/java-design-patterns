package fr.diginamic.composite;

public class Employe implements IElement {

	protected String nom;
	protected String prenom;
	protected Double salaire;

	public Employe(String nom, String prenom, Double salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}

	@Override
	public Double calculerSalaire() {
		// TODO Auto-generated method stub
		return salaire;
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
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

	/** Getter pour prenom
	 * @return the prenom 
	*/
	public String getPrenom() {
		return prenom;
	}

	/** Setter pour prenom
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getter pour salaire
	 * @return the salaire 
	*/
	public Double getSalaire() {
		return salaire;
	}

	/** Setter pour salaire
	 * @param salaire
	 */
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

}
