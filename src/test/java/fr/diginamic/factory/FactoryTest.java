package fr.diginamic.factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryTest {

	/**
	 * 
	 */
	@Test
	public void testCreateIngredient() {
		Element element = ElementFactory.getElement(TypeElement.INGREDIENT,"Sel", 5.0, Unite.GRAMMES);
		
		assertTrue(element instanceof Ingredient);
		assertEquals(element.getNom(), "sel");
		// toujours preciser la valeur de précision
		assertEquals(element.getValeur(), 5.0, 0.0001);
	}
	@Test
    public void testCreateAllergene() {
        Element element = ElementFactory.getElement(TypeElement.ALLERGENE,"Sel", 5.0, Unite.KG);
        assertTrue(element instanceof Allergene);
    }

   

    @Test
    public void testCreateAdditif() {
        Element element = ElementFactory.getElement(TypeElement.ADDITIF,"Sel", 5.0, Unite.GRAMMES);
        assertTrue(element instanceof Additif);
    }

}
