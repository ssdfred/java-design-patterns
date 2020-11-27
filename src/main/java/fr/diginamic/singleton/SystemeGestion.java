package fr.diginamic.singleton;

/** Système de gestion de la paye
 * @author RichardBONNAMY
 *
 */
public class SystemeGestion {

	/** Génère un bulletin de salaire au format PDF
	 * @param bulletinSalaire
	 * @param filePath path du fichier (ex: C:/Temp/monFichier.pdf) 
	 */
	public void genererPdf(BulletinSalaire bulletinSalaire, String filePath) {
		
		BulletinSalairePdf pdf = new DocumentPdfBuilder(filePath)
				                     .appendIdentite(bulletinSalaire.getNom(), bulletinSalaire.getPrenom())
				                     .appendSalaire(bulletinSalaire.getSalaire())
				                     .get();
		pdf.generer();
	}
}
