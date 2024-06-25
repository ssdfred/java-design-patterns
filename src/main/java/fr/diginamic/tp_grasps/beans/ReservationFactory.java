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
	public abstract Reservation getInstance(String identifiantClient,String dateReservationStr, TypeReservation typeReservation, int nbPlaces);

}

