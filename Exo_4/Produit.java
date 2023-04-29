import java.util.Scanner;

public class Produit {
    public static void main(String[] arg) {
        int a, b, resultat;
        System.out.print("Veuillez saisir un premier nombre : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        System.out.print("Veuillez saisir un deuxieme nombre : ");
        Scanner scb = new Scanner(System.in);
        b = scb.nextInt();

        // Traitement
        resultat = a * b;
        if (resultat < 0) {
            System.out.println("Pour Info, le produit des nombres saisies est négatif");
        } else {
            System.out.println("Pour Info, le produit des nombres saisies est positif");
        }
    }
}
