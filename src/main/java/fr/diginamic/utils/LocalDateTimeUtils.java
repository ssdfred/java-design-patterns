package fr.diginamic.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe utilitaire pour gérer les dates.
 */
public class LocalDateTimeUtils {

    /** formatter */
    private static DateTimeFormatter formatstandard = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    /**
     * Convertit une chaîne de caractères en LocalDateTime.
     * 
     * @param dateString La chaîne de caractères représentant la date et l'heure.
     * @return Un objet LocalDateTime correspondant à la chaîne de caractères.
     */
    public static LocalDateTime toDate(String dateString) {
        return LocalDateTime.parse(dateString, formatstandard);
    }
}
