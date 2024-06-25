package fr.diginamic.factory;

public class Produit {
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private Element element;
    private TypeElement type;

    // Getters
    public String getNom() {
        return nom;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public String getDescription() {
        return description;
    }

    public Element getElement() {
        return element;
    }

    public TypeElement getType() {
        return type;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setElement(Element element) {
        this.element = element;
        if (element != null) {
            this.type = element.getType();
        }
    }

    public void setType(TypeElement type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", element=" + (element != null ? element.getNom() : "null") +
                ", type=" + (type != null ? type.name() : "null") +
                '}';
    }
}
