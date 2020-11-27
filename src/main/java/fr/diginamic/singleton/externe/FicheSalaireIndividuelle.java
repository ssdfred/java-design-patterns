package fr.diginamic.singleton.externe;

/** Fiche de salaire individuelle
 * @author RichardBONNAMY
 *
 */
public class FicheSalaireIndividuelle {
	/** nom */
	private String nomSalarie;
	/** prenom */
	private String prenomSalarie;
	/** salaire */
	private double salaire;
	
	/** Constructeur
	 * @param nomSalarie nom du salarié
	 * @param prenom prénom du salarié
	 * @param salaire salaire
	 */
	public FicheSalaireIndividuelle(String nomSalarie, String prenomSalarie, double salaire) {
		super();
		this.nomSalarie = nomSalarie;
		this.prenomSalarie = prenomSalarie;
		this.salaire = salaire;
	}

	/** Getter
	 * @return the nomSalarie
	 */
	public String getNomSalarie() {
		return nomSalarie;
	}

	/** Setter
	 * @param nomSalarie the nomSalarie to set
	 */
	public void setNomSalarie(String nomSalarie) {
		this.nomSalarie = nomSalarie;
	}

	/** Getter
	 * @return the prenomSalarie
	 */
	public String getPrenomSalarie() {
		return prenomSalarie;
	}

	/** Setter
	 * @param prenomSalarie the prenomSalarie to set
	 */
	public void setPrenomSalarie(String prenomSalarie) {
		this.prenomSalarie = prenomSalarie;
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
