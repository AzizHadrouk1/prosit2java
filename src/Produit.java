package tn.tuniprob.gestionmagasin;

public class Produit {
    private String nom;
    private double prix;

    // Constructeur
    public Produit(String nom, double prix) {
        this.nom = nom;
        setPrix(prix);  // Utilisation du setter pour vérifier le prix
    }

    // Getter pour le nom
    public String getNom() {
        return nom;
    }

    // Getter pour le prix
    public double getPrix() {
        return prix;
    }

    // Setter pour le prix avec validation
    public void setPrix(double prix) {
        if (prix < 0) {
            System.out.println("Le prix ne peut pas être négatif.");
            this.prix = 0;
        } else {
            this.prix = prix;
        }
    }

    // Méthode pour afficher les détails du produit
    public String toString() {
        return "Produit: " + nom + ", Prix: " + prix + " TND";
    }
}
