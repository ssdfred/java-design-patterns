package fr.diginamic.tp_grasps.beans;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import fr.diginamic.tp_grasps.CustomDateTimeSerializer;

/** Représente une opération bancaire
 * @author RichardBONNAMY
 *
 */
public class Operation {

	/** Type de l'opération */
	private TypeOperation type;
	
	/** Montant de l'opération */
	private double montant;
	
	/** Date de passage de l'opération */
	@JsonDeserialize(using = CustomDateTimeSerializer.class)
	private LocalDateTime date;
	
	/** Constructeur
	 * 
	 */
	public Operation() {
		
	}
	
	/** Getter
	 * @return the type
	 */
	public TypeOperation getType() {
		return type;
	}
	/** Setter
	 * @param type the type to set
	 */
	public void setType(TypeOperation type) {
		this.type = type;
	}
	/** Getter
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}
	/** Setter
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}
	/** Getter
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}
	/** Setter
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
}
