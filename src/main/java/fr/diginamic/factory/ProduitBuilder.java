package fr.diginamic.factory;


public class ProduitBuilder {
    private Produit produit;

    public ProduitBuilder() {
        this.produit = new Produit();
    }

    public ProduitBuilder appendNom(String nom) {
        produit.setNom(nom);
        return this;
    }

    public ProduitBuilder appendMarque(String marque) {
        produit.setMarque(marque);
        return this;
    }

    public ProduitBuilder appendPrix(double prix) {
        produit.setPrix(prix);
        return this;
    }

    public ProduitBuilder appendDescription(String description) {
        produit.setDescription(description);
        return this;
    }

    public ProduitBuilder appendElement(Element element) {
        produit.setElement(element);
        return this;
    }

    public Produit build() {
        return produit;
    }
}
