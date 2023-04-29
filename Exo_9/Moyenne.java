import java.util.Scanner;

public class Moyenne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double somme = 0, moyenne;
        int nombreNote;


        System.out.print("Veuillez saisir le nombre de note de classe a saisir : ");
        nombreNote = input.nextInt();
        double[] tableauNote = new double[nombreNote];

        // Boucle For pour la saisie des notes dans le tableau
        for (int i = 0; i < nombreNote; i++) {
            System.out.print("Veuillez saisir la note " + i + " : ");
            tableauNote[i] = input.nextFloat();
            somme = somme + tableauNote[i];
        }

        // Calcul de la moyenne
        moyenne = somme / nombreNote;

        System.out.println("La moyenne des notes saisie est : " + String.format("%.2f", moyenne));

        // Affichage des notes superieur a la moyenne

        for (int j = 0; j < nombreNote; j++) {
            if (tableauNote[j] >= moyenne) {
                System.out.println("Note superieur a la moyenne general : " + tableauNote[j]);
            }
        }
    }
}
