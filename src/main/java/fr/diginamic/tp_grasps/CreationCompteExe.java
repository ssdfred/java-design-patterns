package fr.diginamic.tp_grasps;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import fr.diginamic.tp_grasps.beans.CompteBancaire;
import fr.diginamic.tp_grasps.beans.Operation;
import fr.diginamic.tp_grasps.utils.Params;

/** Classe qui créé un compte bancaire à partir de données extraites de 2 fichiers
 * puis affiche le résultat d'une opération
 * @author RichardBONNAMY
 *
 */
public class CreationCompteExe {

	/** Méthode exécutable
	 * @param args non utilisés
	 */
	public static void main(String[] args) {

		String nom = Params.getParam("nom");
		String prenom = Params.getParam("prenom");
		String dateCreation = Params.getParam("dateCreation");
		
		// Conversion de dateCreation en LocalDateTime
		LocalDateTime localDate = toLocalDate(dateCreation);

		// Création d'un nouveau compte bancaire
		CompteBancaire compteBancaire = new CompteBancaire(nom, prenom);
		compteBancaire.setDateCreation(localDate);
		compteBancaire.setOperations(new ArrayList<Operation>());

		// Parsing d'un fichier JSON avec Jackson
		ObjectMapper objectMapper = new ObjectMapper();
		
		InputStream in = CreationCompteExe.class.getClassLoader().getResourceAsStream("operations.json");
		try {
			Operation[] operations = objectMapper.readValue(in, Operation[].class);
			
			// Alimentation de la liste d'opérations du compte bancaire
			List.of(operations).forEach(o -> compteBancaire.getOperations().add(o));

		} catch (IOException e) {
			throw new RuntimeException("Lecture et parsing du fichier operations.json en erreur:" + e.getMessage());
		}
		
		// Exploitation des résultats
		
		double montant = compteBancaire.getOperation(toLocalDate("20/11/2020 08:27:14")).getMontant();
		System.out.println(montant);
	}

	public static LocalDateTime toLocalDate(String dateStr) {
		return LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
}
