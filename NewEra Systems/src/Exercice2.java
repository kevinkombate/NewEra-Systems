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
        System.out.println("Un article par ligne SVP et 'STOP' quand la liste est terminée");
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


    public void offresSimples(LinkedList L){


        double prixFinal = 0.0;
        int compteurNbrePomme = 0;
        int compteurNbreOrange = 0;


        for(Object a: L){

            if(a.equals("POMME"))
                compteurNbrePomme++;
                if(compteurNbrePomme % 2 == 0)
                    prixFinal = prixFinal;
                else prixFinal+=pommePrix;

            if(a.equals("ORANGE"))
                compteurNbreOrange++;
                if(compteurNbreOrange % 3 == 0)
                    prixFinal = prixFinal;
                else prixFinal += orangePrix;
        }


        System.out.println();
        System.out.println("Le prix total est de: " + prixFinal +"$");



    }

    public static void main (String [] args){

        System.out.println("###############################################");
        System.out.println("#                                             #");
        System.out.println("#               SHOPPING CART                 #");
        System.out.println("#                                             #");
        System.out.println("###############################################");

        System.out.println();
        System.out.println();

        System.out.println("NOS OFFRES HABITUELLES !!!");
        System.out.println("** Achetez une pomme, obtenez-en une gratuitement **");
        System.out.println("** Achetez deux Oranges, et obtenez la 3ième gratuitement. **");

        System.out.println("---------------------------------------------------------------------");

        System.out.println();


        while(true) {
            System.out.println("AVONS NOUS DES OFFRES CETTE SEMAINE ? (OUI/NON)");

            Exercice2 ex = new Exercice2();
            Scanner sc = new Scanner(System.in);


            String input = sc.nextLine().toUpperCase();

            if (input.equals("OUI"))
                ex.offresSimples(ex.InputReader());
            else if (input.equals("NON"))
                ex.shoppingCart(ex.InputReader());

        }


    }
}
