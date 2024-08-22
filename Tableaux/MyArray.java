import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
// import java.util.Integer;
import java.util.HashSet;
//Déclaration de tableau 
// Assignation de valeur à un tableau
// Initialiser un tableau 
// Parcours de tableau

/*
* Stocker une collection de données d'un même type
*/

public class MyArray {
    public static void main(String[] args) {
        String[] code; // Déclaration de la variable code
        char[] alphabet; // Déclaration de la variable alphabet
        
        String[] fruits = new String[5]; //Déclaration et définition de la taille
        int[] number1 = {15, 40, 58, 20}; //Initialisation d'un tableau de nombre

        byte[] MyByte = {14, 115, 14};
        System.out.println(MyByte);
        System.out.println("Element à l'index 0 est " + MyByte[0]);
        MyByte[1] = 100;
        System.out.println("Element à l'index 1 est " + MyByte[1]);

        //Ajout d'élément dans le tableau fruit
        System.out.println("Mon fruit à l'index 0 "+ fruits[0]);
        System.out.println("Mon fruit à l'index 4 " + fruits[4]);

        fruits[3] = "Pomme" ;
        fruits[0] = "Banane" ;
        fruits[1] = "Orange" ;
        fruits[2] = "Ananas" ;
        fruits[4] = "Raisin" ;

        //Affichage des éléments du table 
        //Utilisation de for
        // for (int i = 0; i < fruits.length; i++) {
        //     System.out.println("L'élement à l'index " + i + " est " + fruits[i]);
        // };

        
        // Exercice 1
        // int[] myNum = {5, 2, 9, 1, 5, 6};
        // Arrays.sort(myNum);
        // for (int i : myNum) {
        //     System.out.println(i);
        // }

        // Exercice 2
        // int[] array = {1, 2, 3, 4, 5, 6};
        // for(int i = 1; i <= array.length; i++) {
        //     if (i % 2 == 0) {
        //         System.out.println(i);
        //     }
        // }

        //Exercice 3
        int[] intNumber = {3, 5, 7, 2, 8};
        int length = intNumber.length;
        int max = intNumber[0];
        int min = intNumber[0];
        for(int i: intNumber) {
            if(max < i) {
                max = i;
            }
            if(min > i) {
                min = i;
            }
        }
            System.out.println("Max: " + max + ", " + " Min: " +  min);
        
        //Exercice 4
        long[] binariTab = {1, 3, 5, 7, 9};

        Scanner enter = new Scanner(System.in);
        long userEnter;
        System.out.println("Entrer un nombre");
        //  Scanner.close();
        userEnter = enter.nextLong();
        long index = Arrays.binarySearch(binariTab, userEnter);
         System.out.println("Index: " + index);

         //Exercice 5 
         int[] doublons = {1, 2, 2, 3, 4, 4, 5};
         Set<Integer> uniqueVal = new HashSet<>();

         for(int item: doublons) {
            uniqueVal.add(item);
         }
         System.out.println(uniqueVal);
    }
}
