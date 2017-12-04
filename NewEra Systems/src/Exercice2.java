import java.util.*;
import java.util.Map.Entry;


public class Exercice2 {

    final double orangePrix = 1.25; // Prix d'une orange
    final double pommePrix  = 0.60; // Prix d'une pomme


    public LinkedList InputReader(){

        LinkedList L = new LinkedList();

        Scanner sc = new Scanner(System.in);

        System.out.println("Qu'avez-vous achetez aujourd'hui?");
        System.out.println();
        System.out.println("Un article par ligne SVP");
        System.out.println("'STOP' quand la liste est terminée");
        System.out.println("Exemple :");
        System.out.println("   ORANGE");
        System.out.println("   POMME");
        System.out.println("   STOP");
        System.out.println("C'est à vous :");

        while(true){

            String input = sc.nextLine().toUpperCase();

            if(input.equals("STOP"))
                break;

            if(input.equals("ORANGE") || input.equals("POMME"))
                L.add(input);
            else
                System.out.println("Ne fait pas parti de notre liste d'articles !");
        }

        return L;
    }

    public void shoppingCart(LinkedList L){

        double prixFinal = 0.0;

        for(Object a  : L){
            if(a.equals("ORANGE"))
                prixFinal += orangePrix;

            else if (a.equals("POMME"))
                prixFinal += pommePrix;
        }

        System.out.println();
        System.out.println("Le prix total est de: " + prixFinal +"$");

    }

    public static void main (String [] args){

        Exercice2 ex = new Exercice2();
        LinkedList articles = ex.InputReader();
        ex.shoppingCart(articles);

    }
}
