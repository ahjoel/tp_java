import java.util.Scanner;

class Echange {
    public static void main(String arg[]) {
        // Déclaration de variable
        int a, b, c;

        // Affichage a l'écran de la saisie du nombre a
        System.out.print("Entrer un nombre a : ");
        
        // Lecture du nombre a
        Scanner sc = new Scanner(System.in);
        // Réception du nombre a saisie
        a = sc.nextInt();
        
        // Affichage a l'écran de la saisie du nombre b
        System.out.print("Entrer un nombre b : ");
        
        // Lecture du nombre a
        // Scanner scb = new Scanner(System.in);
        // Réception du nombre a saisie
        b = sc.nextInt();

        // Traitement
        c = a;
        a = b;
        b = c;

        System.out.println("Le resultat est : ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
}