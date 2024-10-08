
public class Main {
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

//        Valeurs random à TabScore
//        On attribue des valeurs aléatoires à chaque case de TabScore
//        Random random = new Random();
//        for (int i = 0; i < TabScore.length; i++) {
//            On tire un nombre aléatoire jusqu'à 101 exclu et on assigne le nombre à la variable number
//            int number = random.nextInt(101);
//            TabScore[i] = number;
//        }

        //Parcourir TabScore et afficher chaque case
        //for ( DEPART; CONDITION D'ARRÊT; INCRÉMENT)
        //"for" = boucle
        for (int i = 0; i < TabScore.length; i++) {
            //Afficher chaque case
            int score = TabScore[i];
            System.out.println(score);
        }

        //Parcourir TabScore et ajout de chaque valeur dans moyenne
        float moyenne = 0;

        for (int i = 0; i < TabScore.length; i++){
            moyenne = moyenne + TabScore[i];
        }

        //Afficher la moyenne
        moyenne = moyenne / TabScore.length;
        System.out.println("moyenne = " +moyenne);

    }
}