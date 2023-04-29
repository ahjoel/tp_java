import java.util.Scanner;

public class Factoriel {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int i, factoriel = 1, nombreDepart;

        System.out.print("Veuillez saisir un nombre pour le calcul de la factoriel : ");
        nombreDepart = input.nextInt();

        // Loop - For - Pour
        for (i = 1; i <= nombreDepart; i++) {
            factoriel *= i;
        }

        System.out.println("Le resultat est : " + factoriel);
    }
}
