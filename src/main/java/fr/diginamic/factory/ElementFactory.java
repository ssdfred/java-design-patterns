package fr.diginamic.factory;

public class ElementFactory {

	public static Element getElement(TypeElement type, String nom, Double valeur, Unite unite) {
		Element element = null;
		switch (type) {
		case INGREDIENT:

			element = new Ingredient(type, nom, valeur, unite);
			break;
		case ALLERGENE:
			element = new Allergene(type,nom, valeur, unite);
			break;
		case ADDITIF:
			element = new Additif(type, nom, valeur, unite);
			break;
			
		}
		return element;
	}
}