package fr.diginamic.singleton;

/** Représente un bulletin de salaire
 * @author RichardBONNAMY
 *
 */
public class BulletinSalaire {

	/** nom */
	private String nom;
	/** prenom */
	private String prenom;
	/** salaire */
	private double salaire;
	
	/** Constructeur
	 * @param nom nom
	 * @param prenom prénom
	 * @param salaire salaire
	 */
	public BulletinSalaire(String nom, String prenom, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** Getter
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/** Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/** Getter
	 * @return the salaire
	 */
	public double getSalaire() {
		return salaire;
	}
	/** Setter
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
}
