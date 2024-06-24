package fr.diginamic.factory;

public class ElementFactory {

    public static Element getElement(String nom, Double valeur, Unite unite) {
        if (unite == Unite.INGREDIENT) {
            return new Ingredient(nom, valeur, unite);
        } else if (unite == Unite.ALLERGENE) {
            return new Allergene(nom, valeur, unite);
        } else {
            return new Additif(nom, valeur, unite);
        }
    }
}
