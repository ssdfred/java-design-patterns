package fr.diginamic.factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProduitBuilderTest {

    
	 @Test
	    public void testCreateAdditif() {
	        Additif additif = new Additif(TypeElement.ADDITIF, "E300", 1.0, Unite.GRAMMES);
	        Produit produit = new ProduitBuilder()
	                .appendNom("coquillete")
	                .appendMarque("Panzani")
	                .appendPrix(5.2)
	                .appendDescription("de bonne pates")
	                .appendElement(additif)
	                .build();

	        assertTrue(produit.getElement() instanceof Additif);
	        assertEquals("coquillete", produit.getNom());
	        assertEquals("Panzani", produit.getMarque());
	        assertEquals(5.2, produit.getPrix(), 0.001);  // Précision de la comparaison des doubles
	        assertEquals("de bonne pates", produit.getDescription());
	        assertEquals(TypeElement.ADDITIF, produit.getType());
	    }

    



}
