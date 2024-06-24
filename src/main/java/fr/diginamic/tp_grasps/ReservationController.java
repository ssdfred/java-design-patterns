package fr.diginamic.tp_grasps;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import fr.diginamic.utils.Calcul;
import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.ReservationFactory;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;
import fr.diginamic.utils.LocalDateTimeUtils;

/** Controlleur qui prend en charge la gestion des réservations client
 * @author RichardBONNAMY
 *
 */
public class ReservationController  {
	/** DAO permettant d'accéder à la table des clients */
	public static ClientDao clientDao = new ClientDao();
	
	/** DAO permettant d'accéder à la table des types de réservation */
	public  TypeReservationDao typeReservationDao = new TypeReservationDao();

	/** Méthode qui créée une réservation pour un client à partir des informations transmises
	 * @param params contient toutes les infos permettant de créer une réservation
	 * @return Reservation
	 */
	public Reservation creerReservation(Params params) {
		
		// 1) Récupération des infos provenant de la classe appelante
		String identifiantClient = params.getIdentifiantClient();
		String dateReservationStr = params.getDateReservation();
		String typeReservationstr = params.getTypeReservation();
		int nbPlaces = params.getNbPlaces();
		
		 // 2) Conversion de la date de réservation en LocalDateTime
	    LocalDateTime dateReservation = LocalDateTimeUtils.toDate(dateReservationStr);
	    
	    // 3) Récupération du client et du type de réservation à partir de leur identifiant
	    Client client = clientDao.extraireClient(identifiantClient);
	    TypeReservation typeReservation = typeReservationDao.extraireTypeReservation(typeReservationstr);	    
	    // 4) Vérification que le client et le type de réservation existent
	    if (client == null || typeReservation == null) {
	        throw new IllegalArgumentException("Client ou type de réservation introuvable.");
	    }
	    
	    // 5) Création de la réservation avec la factory
	    Reservation reservation = ReservationFactory.getInstance(identifiantClient, dateReservationStr, typeReservationStr, nbPlaces);
	    
	    // 6) Calcul du montant total de la réservation
	    Calcul.calculerMontantTotal(reservation, client, typeReservation, nbPlaces);
	    
	    // 7) Ajout de la réservation au client
	    client.getReservations().add(reservation);
	    
	    // 8) Retour de la réservation créée
	    return reservation;
		
	}

}
