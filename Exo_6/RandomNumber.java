import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] arg){
        int randomNumber, num;
        String info;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        randomNumber = rand.nextInt(11) + 10;
        // Loops Do while - Faire tant que
        do {
            System.out.print("Veuillez saisir un nombre dans l'intervalle de 10 et 20 qui correspond au random: ");
            num = input.nextInt();

            if (num < 10){
                info = "Plus petit, reesayer!";
            } else if (num > 20) {
                info = "Plus grand, reesayer!";
            } else if (num < randomNumber) {
                info = "Le nombre est inférieur, reesayer!";
            } else if (num > randomNumber) {
                info = "Le nombre est supérieur, reesayer!";
            } else if (num == randomNumber) {
                info = "Vous avez reussi";
            } else {
                info = "Hors catégorie";
            }
            System.out.println(info);

        } while (num != randomNumber);


        System.out.print("Vous avez réussi le nombre correct est : " + num);
    }
}
