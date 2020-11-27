package fr.diginamic.singleton;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfWriter;

import fr.diginamic.singleton.utils.DateUtils;

/**
 * Encapsule les méthodes iText de génération d'un PDF
 * 
 * @author RichardBONNAMY
 *
 */
public class BulletinSalairePdf {

	/** document */
	private Document document;
	/** writer */
	private PdfWriter writer;
	
	/** Blanc : BaseColor */
	public static final BaseColor WHITE = new BaseColor(255, 255, 255);
	/** Rouge : BaseColor */
	public static final BaseColor RED = new BaseColor(255, 0, 0);
	/** Bleu Diginamic : BaseColor */
	public static final BaseColor DIGIBLUE = new BaseColor(0, 51, 80);
	/** Gris foncé : BaseColor */
	public static final BaseColor DARK_GREY = new BaseColor(50, 50, 50);
	
	/** BILAN_HEADER : Font */
	public static final Font HEADER = new Font(FontFamily.HELVETICA, 16, Font.BOLD, DIGIBLUE);
	/** DATE_HEADER : Font */
	public static final Font DATE_HEADER = new Font(FontFamily.HELVETICA, 10, Font.NORMAL, DIGIBLUE);
	
	/** DATE_HEADER : Font */
	public static final Font VALUE = new Font(FontFamily.HELVETICA, 16, Font.NORMAL, DARK_GREY);
	/** DATE_HEADER : Font */
	public static final Font VALUE_RED = new Font(FontFamily.HELVETICA, 16, Font.NORMAL, RED);
	
	/**
	 * Constructeur
	 * 
	 */
	public BulletinSalairePdf(String filePath) {
		
		document = new Document();
		try {
			writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));
		} catch (IOException | DocumentException e) {
			throw new RuntimeException(e);
		}
		document.open();

		addEntete();
	}

	private void addEntete() {
		ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_RIGHT, new Phrase("BULLETIN DE SALAIRE", HEADER),
				550, 800, 0);
		ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_RIGHT,
				new Phrase("Le " + DateUtils.format(LocalDate.now()), DATE_HEADER), 550, 785, 0);
	}

	/** Ajout des informations d'identité
	 * @param nom nom
	 * @param prenom prénom
	 */
	public void addIdentite(String nom, String prenom) {

		ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT, new Phrase("NOM:", HEADER), 50, 700, 0);
		ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT, new Phrase("PRENOM:", HEADER), 50, 650, 0);
		
		ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT, new Phrase(nom.toUpperCase(), VALUE), 180, 700, 0);
		ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT, new Phrase(prenom, VALUE), 180, 650, 0);
	}
	
	/** Ajout des informations de salaire
	 * @param salaire salaire
	 */
	public void addSalaire(double salaire) {

		ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT, new Phrase("SALAIRE:", HEADER), 50, 600, 0);
		
		ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT, new Phrase(Double.toString(salaire), VALUE_RED), 180, 600, 0);
	}

	/**
	 * Génère le fichier PDF
	 * 
	 * @param nom path et nom du fichier
	 */
	public void generer() {
		document.close();
	}
}
