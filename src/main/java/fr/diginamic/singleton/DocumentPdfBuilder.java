package fr.diginamic.singleton;

/** Permet de construire un document PDF
 * @author RichardBONNAMY
 *
 */
public class DocumentPdfBuilder {
	
	/** documentPdf */
	private BulletinSalairePdf documentPdf;
	
	/** Constructeur
	 * @param filepath path du fichier
	 */
	public DocumentPdfBuilder(String filepath) {
		documentPdf = new BulletinSalairePdf(filepath);
	}

	/** Ajout de l'identité au document PDF
	 * @param nom nom
	 * @param prenom prénom
	 * @return DocumentPdfBuilder
	 */
	public DocumentPdfBuilder appendIdentite(String nom, String prenom) {
		documentPdf.addIdentite(nom, prenom);
		return this;
	}
	

	/** Ajout de l'information de salaire au document PDF
	 * @param salaire salaire
	 * @return DocumentPdfBuilder
	 */
	public DocumentPdfBuilder appendSalaire(double salaire) {
		documentPdf.addSalaire(salaire);
		return this;
	}

	/** Retourne le document PDF
	 * @return {@link BulletinSalairePdf}
	 */
	public BulletinSalairePdf get() {
		return documentPdf;
	}

}
