package tn.tuniprob.gestionmagasin;

public class Magasin {
    private int id;
    private String adresse;
    private int capacite;
    private Produit[] produits;  // Tableau de produits
    private int nbProduits;  // Nombre actuel de produits dans le magasin
    private static int totalProduits = 0;  // Compteur pour tous les produits dans tous les magasins

    // Constructeur
    public Magasin(int id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new Produit[capacite];  // Initialisation du tableau de produits avec la capacité donnée
        this.nbProduits = 0;  // Initialisation du nombre de produits
    }

    // Méthode pour ajouter un produit
    public boolean ajouterProduit(Produit produit) {
        if (nbProduits < capacite) {
            produits[nbProduits] = produit;  // Ajout du produit dans le tableau
            nbProduits++;
            totalProduits++;
            return true;
        } else {
            System.out.println("Capacité maximale atteinte. Impossible d'ajouter plus de produits.");
            return false;
        }
    }

    // Méthode pour afficher les caractéristiques du magasin
    public void afficherCaracteristiques() {
        System.out.println("Magasin ID: " + id);
        System.out.println("Adresse: " + adresse);
        System.out.println("Capacité: " + capacite);
        System.out.println("Produits dans le magasin: ");
        for (int i = 0; i < nbProduits; i++) {
            System.out.println(produits[i]);
        }
    }

    // Méthode statique pour obtenir le nombre total de produits dans tous les magasins
    public static int getTotalProduits() {
        return totalProduits;
    }
}
