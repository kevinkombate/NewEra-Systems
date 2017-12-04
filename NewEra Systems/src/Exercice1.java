import java.util.ArrayList;
import java.util.Scanner;

public class Exercice1 {

    public void findNextHigherNumber (String number){

        /** Mettre le mot dans un ArrayList */

        int numero = Integer.parseInt(number); // Conversion de String en Integer
        ArrayList<Character> tabNumber = new ArrayList<>(); // Création d'une ArrayList qui va contenir chaque chiffre du numéro entré

        for (int i = 0 ; i < number.length(); i++){
            tabNumber.add(number.charAt(i));
        }

        /** Algorithme  pour trouver le plus grand prochain numéro*/
        numero++;
        boolean loop = true;

        while(loop) {

            boolean verifyA = false;
            boolean verifyB = false;
            String s = ""+numero;


            /* Verifie si le nombre entré + 1 contient les mêmes chiffres que le numero entré par l'utilisateur */
            for (int i = 0; i< s.length(); i++) {
                if (!tabNumber.contains(s.charAt(i))) { // Si contient pas les mêmes chiffres
                    numero++; // on incrémente le numero de 1
                    verifyA = true;
                    break;
                }
            }

            boolean hasIncremented = false;

            /* Verifie si le nombre entré + 1 contient le meme chiffre deux fois */
            for(int j = 0 ; j < number.length(); j++) {
                for (int h = 0; h < s.length(); h++) {
                    if ((s.charAt(j) == s.charAt(h)) && (j != h) && !hasIncremented) { // Si oui contient le meme chiffre deux fois
                        numero++;  // incremente le numéro de 1.
                        hasIncremented = true;
                        verifyB = true;

                    }
                }
            }
            /* Verifie si le chiffre est passé par les etapes puis fais un ou logique, si me retourne false alors le
             * le numéro supérieur suivant avec les mêmes chiffres a été trouvé, la boucle s'arrête */
            loop = verifyA || verifyB;
        }

        System.out.println("Le numéro supérieur suivant avec les mêmes chiffres est: " + numero);
    }

    public static void main(String[] args){

        Exercice1 ex = new Exercice1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un numéro :");
        String str = sc.nextLine();
        ex.findNextHigherNumber(str);

    }

}