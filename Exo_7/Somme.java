import java.util.Scanner;

public class Somme {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int i, res=0, nombreDepart;

        System.out.print("Veuillez saisir un nombre de départ : ");
        nombreDepart = input.nextInt();

        // Loop - For - Pour
        for (i=0; i<nombreDepart+1; i++) {
            res = res + i;
        }

        System.out.println("Le resultat est : " + res);
    }
}
