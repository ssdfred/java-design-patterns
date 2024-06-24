package fr.diginamic.factory;

import static org.junit.Assert.*;



import org.junit.Test;

public class FactoryTest {

	@Test
	public void testCreateIngredient() {
		Element element = ElementFactory.getElement("Sel", 5.0, Unite.INGREDIENT);
		assertTrue(element instanceof Ingredient);
	}
	@Test
    public void testCreateAllergene() {
        Element element = ElementFactory.getElement( "Sel", 5.2, Unite.ALLERGENE);
        assertTrue(element instanceof Allergene);
    }

   

    @Test
    public void testCreateAdditif() {
        Element element = ElementFactory.getElement("Colorant", 0.5, Unite.ADDITIF);
        assertTrue(element instanceof Additif);
    }

}
