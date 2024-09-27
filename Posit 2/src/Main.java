package tn.tuniprob.gestionmagasin;

public class Main {
    public static void main(String[] args) {
        // Création d'un magasin avec une capacité de 50 produits
        Magasin magasin1 = new Magasin(1, "Avenue Habib Bourguiba", 50);

        // Ajout de quelques produits au magasin
        Produit produit1 = new Produit("Chaise", 120.50);
        Produit produit2 = new Produit("Table", 300);
        Produit produit3 = new Produit("Lampe", -50);  // Ce produit aura un prix de 0 à cause de la validation

        magasin1.ajouterProduit(produit1);
        magasin1.ajouterProduit(produit2);
        magasin1.ajouterProduit(produit3);

        // Affichage des caractéristiques du magasin et des produits
        magasin1.afficherCaracteristiques();

        // Affichage du nombre total de produits dans tous les magasins
        System.out.println("Nombre total de produits dans tous les magasins: " + Magasin.getTotalProduits());
    }
}
