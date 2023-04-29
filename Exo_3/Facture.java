package Exo_3;

import java.util.Scanner;

class Facture {
    public static void main(String[] arg) {
        double prix_ttc, prix_ht, nb_article, prix_tva;
        double taux_tva, tva;

        System.out.print("Veuillez saisir le prix hors taxe du produit : ");

        // Lecture du prix_ht
        Scanner sc = new Scanner(System.in);
        prix_ht = sc.nextInt();

        System.out.print("Veuillez saisir le nombre d\'article achete : ");

        // Lecture du nb_article
        Scanner scn = new Scanner(System.in);
        nb_article = scn.nextInt();

        System.out.print("Veuillez saisir le tva applique dans votre pays : ");

        // Lecture du tva
        Scanner sct = new Scanner(System.in);
        tva = sct.nextInt();

        taux_tva = tva / 100.0;
        prix_tva = taux_tva * (prix_ht * nb_article);
        prix_ttc = (prix_ht * nb_article) + prix_tva;

        System.out.print("Le prix ttc est : " + prix_ttc);

    }
}
