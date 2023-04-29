import java.util.Scanner;

public class Age {
    public static void main(String[] arg){
        int age;
        String info;
        System.out.print("Cher utilisateur, veuillez entrer votre age : ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if((age >= 6) && (age <= 7)){
            info = "Poussin";
        } else if ((age >= 8) && (age <= 9)) {
            info = "Pupille";
        } else if ((age >= 10) && (age <= 11)) {
            info = "Minime";
        } else if (age >= 12) {
            info = "Cadet";
        }else {
            info = "Hors catégorie";
        }

        System.out.print("Votre categorie est : " + info);
    }
}
