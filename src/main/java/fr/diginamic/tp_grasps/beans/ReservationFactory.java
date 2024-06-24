package fr.diginamic.tp_grasps.beans;

import java.time.LocalDateTime;

import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;
import fr.diginamic.utils.LocalDateTimeUtils;

public abstract class ReservationFactory {

	
	/** DAO permettant d'accéder à la table des clients */
	public static ClientDao clientDao = new ClientDao();
	
	/** DAO permettant d'accéder à la table des types de réservation */
	public  TypeReservationDao typeReservationDao = new TypeReservationDao();
	public Reservation getInstance(String identifiantClient,String dateReservationStr, String typeReservation, int nbPlaces) {
		
		// 2) Conversion de la date de réservation en LocalDateTime
		LocalDateTime dateReservation = LocalDateTimeUtils.toDate(dateReservationStr);
		// 3) Extraction de la base de données des informations client
		Client client = clientDao.extraireClient(identifiantClient);
		
		// 4) Extraction de la base de données des infos concernant le type de la réservation
				TypeReservation type = typeReservationDao.extraireTypeReservation(typeReservation);
				
		// 5) Création de la réservation
				Reservation reservation = new Reservation(dateReservation);
				reservation.setNbPlaces(nbPlaces);
				reservation.setClient(client);
				
				// 6) Ajout de la réservation au client
				client.getReservations().add(reservation);

	// 7) Calcul du montant total de la réservation qui dépend:
			//    - du nombre de places
			//    - de la réduction qui s'applique si le client est premium ou non
			double total = type.getMontant() * nbPlaces;
			if (client.isPremium()) {
				reservation.setTotal(total*(1-type.getReductionPourcent()/100.0));
			}
			else {
				reservation.setTotal(total);
			}
			return reservation;
		}
}

