package fr.diginamic.factory;

public abstract class Element {
    private String nom;
    private Double valeur;
    private Unite unite;
    private TypeElement type;

    public Element(TypeElement type, String nom, Double valeur, Unite unite) {
        this.type = type;
        this.nom = nom;
        this.valeur = valeur;
        this.unite = unite;
    }

    public String getNom() {
        return nom;
    }

    public Double getValeur() {
        return valeur;
    }

    public Unite getUnite() {
        return unite;
    }

    public TypeElement getType() {
        return type;
    }
}