package fr.diginamic.tp_grasps.beans;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {
	
	@Id
	private Long id;
	
	private LocalDateTime date;
	
	private int nbPlaces;
	
	private double total;
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;
	
	public Reservation() {
		
	}

	Reservation(LocalDateTime date) {
		super();
		this.date = date;
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

	/** Getter
	 * @return the nbPlaces
	 */
	public int getNbPlaces() {
		return nbPlaces;
	}

	/** Setter
	 * @param nbPlaces the nbPlaces to set
	 */
	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	/** Getter
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/** Setter
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/** Getter
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/** Setter
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
}
