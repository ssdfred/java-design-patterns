package fr.diginamic.tp_grasps.beans;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class CompteBancaire {

	/** Nom du client */
	private String nom;
	
	/** Prénom du client */
	private String prenom;
	
	/** Date de création du compte */
	private LocalDateTime dateCreation;
	
	/** Liste des opérations bancaires */
	private List<Operation> operations;
	
	/** Constructeur
	 * @param nom nom
	 * @param prenom prénom
	 */
	public CompteBancaire(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	/** Recherche d'une opération à partir d'une date
	 * @param date date recherchée
	 * @return Operation
	 */
	public Operation getOperation(LocalDateTime date) {
		Optional<Operation> opt = operations.stream().filter(o -> o.getDate().equals(date)).findAny();
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
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
	 * @return the dateCreation
	 */
	public LocalDateTime getDateCreation() {
		return dateCreation;
	}
	/** Setter
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(LocalDateTime dateCreation) {
		this.dateCreation = dateCreation;
	}
	/** Getter
	 * @return the operations
	 */
	public List<Operation> getOperations() {
		return operations;
	}
	/** Setter
	 * @param operations the operations to set
	 */
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
}
