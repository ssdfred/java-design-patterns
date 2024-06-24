package fr.diginamic.utils;


import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;

/**
 * Classe utilitaire pour le calcul du montant total d'une réservation.
 */
public class Calcul  {

	 /**
     * Calcule le montant total d'une réservation.
     * 
     * @param reservation La réservation pour laquelle calculer le montant.
     * @param client Le client effectuant la réservation.
     * @param type Le type de réservation.
     * @param nbPlaces Le nombre de places réservées.
     */
    public static void calculerMontantTotal(Reservation reservation, Client client, TypeReservation type, int nbPlaces) {
        double total = type.getMontant() * nbPlaces;
        if (client.isPremium()) {
            reservation.setTotal(total * (1 - type.getReductionPourcent() / 100.0));
        } else {
            reservation.setTotal(total);
        }
    }
}
