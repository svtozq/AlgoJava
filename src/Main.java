
public class Main {
    //On déclare une fonction Tableau qui prend en paramètre Tab (tableau des scores)
    public static void Tableau (int[] Tab){

        //Parcourir Tab
        for (int i = 0; i < Tab.length; i++) {
            System.out.println(Tab[i]);
        }
    }

    //On déclare une fonction MaxTab qui prend en paramètre Tab (tableau des scores)
    public static void MaxTab (int[] Tab){
        int max = Tab[0];

        //Parcourir Tab
        for (int i = 0; i < Tab.length; i++) {
            //Si la valeur de l'index est > à "Tab[0]" (int max) alors int max prend la nouvelle valeur de l'index et l'affiche
            if ( Tab[i] > max ) {
                max = Tab[i];
                System.out.println("maximum = " +max);
            }
        }
    }

    //On déclare une fonction Vrai qui prend en paramètre Tab (tableau des scores)
    public static boolean Vrai (int[] Tab){
        //Parcourir Tab
        for (int i = 0; i < Tab.length; i++) {
            //Si la valeur de l'index est < 10 alors la fonction renvoie vrai
            if ( Tab [i] < 10 ) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // On déclare un tableau de int nommé TabScore d'une taille de 7 cases
        //"int[]" = tableau de type int
        int[] TabScore = new int[7];

        //On attribue des valeurs différentes à chaque case de TabScore
        //"[]" = case
        TabScore[0] = 15;
        TabScore[1] = 96;
        TabScore[2] = 21;
        TabScore[3] = 3;
        TabScore[4] = 77;
        TabScore[5] = 50;
        TabScore[6] = 34;

        Tableau(TabScore);
        MaxTab(TabScore);
        System.out.println(Vrai(TabScore));

    }

}