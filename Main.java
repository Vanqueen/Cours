import java.util.Scanner;

public class Main {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("La somme de a et b :"+ result);
        return result;
    }
    static int isEven(int number) {
        if(number % 2 == 0) {
            System.out.println("Le resultat est true");
        }else {
             System.out.println("Le resultat est false");
        }
        return number;
    }
    static int factorial(int n) {

    }
    static int multiply(int a, int b) {
        int resultInt = a * b;
        System.out.println("Le produit de a et b: " + resultInt);
        return resultInt;
    }
    static int multiply1(double a, double b) {
        double resultDouble = a * b;
        System.out.println("le produit de a et b: "+ resultDouble);
        // return resultDouble;
    }
    static int reverseString(String str) {
        String reversedStr = "";
    for (int i = 0; i < str.length(); i++) {
        reversedStr = str.charAt(i) + reversedStr;
    }
    System.out.println("La chaîne inversée est "+ reversedStr);
    return reversedStr;
    }
    public static void main(String[] args) {

        //Méthode
        //Exercice1
            sum(5, 7);

        //Exercice 2
        isEven(4);
        isEven(7);

        //Exercice 4
        multiply(3, 4);
        multiply1(3.5d, 4.2d);

        //Exercice 5
        reverseString("hello");

        //Exercice 5
        // int x = 1000000;
        // float y = 15.52f;
        // float z = (float) x;
        // System.out.println(z);

        // Boolean compar3 = z > y;
        // System.out.println(compar3);
        // if(z > y) {
        // System.out.println("z est supérieur à y");
        // }else {
        // System.out.println("z n'est pas supérieur à y");
        // }

    
        // (myVar == true) ? "Value True" : "ifValueFalse";

        // String maVar = "Bj";
        // switch(maVar) {
        //     case "Fr":
        //         System.out.println("France");
        //         break;
        //     case "US":
        //         System.out.println("USA");
        //         break;
        //     default:
        //         System.out.println("Benin");
        //         break;
        // }
    //Structure de controles
        //Exercice 1
    //     int intNum = 58 ;
    //     String compar = (intNum % 2 == 0) ? "Le nombre est pair" : "Le nombre est impair";
    //     System.out.println(compar);

    //     //Exercice 2
    //     int a = 15 ;
    //     int b = 78 ;
    //     int c =  54;

    //   if(a > b && a > c ) {
    //     System.out.println("Le plus grand nombre " + a);
    //   }else if (c > b && c > a) {
    //     System.out.println("Le plus grand nombre " + c);
    //   }else if (b > a && b > c) {
    //     System.out.println("Le plus grand nombre " + b);
    //   }

    //   //Exercice 3
    // int age = 25;

    // if(age <= 12) {
    //     System.out.println("Tu es dans la catégorie Enfant");
    // }else if (age >=13 && age <= 19) {
    //     System.out.println("Tu es dans la catégorie Adolescent");
    // }else if (age >=20 && age <= 64) {
    //     System.out.println("Tu es dans la catégorie Adulte");
    // }else if (age >= 65) {
    //     System.out.println("Tu es dans la catégorie Sénior");
    // }

    // //Exercice 4
    // int note = 75;
    // String reussite = (note >= 50) ? "Vous avez réussi" : "Vous avez échoué";
    // System.out.println(reussite);

    // //Exercice 5
    // int montant = 3025;
 
    // if(montant < 100) {
    //     System.out.println("Pas de remise");
    // }else if(montant >= 100 && montant <= 500) {
    //     int finalMontant = montant - (montant * 10)/100 ;
    //     System.out.println("Vous avez une remise de 10% " + " Le montant d'achat final est " + finalMontant );
    // }else if(montant >= 500) {
    //     int finalMontant = montant - (montant * 20)/100;
    //     System.out.println("Vous avez une remise de 20% " + " Le montant d'achat final est " + finalMontant);
    // }

    //Boucle
    // byte i = 0;

    // while(i< 5) {
    //     System.out.println(i);
    //     i++;
    // }

    // do {
    //     System.out.println(x:"bonjour");
    //     i++;
    // }while(i < 5);
    
    // int x = 5;

    // for(int i = 0; i < 5 ; i++) {
    //     System.out.println("valeur de " + i);
    // }

    //Exercice 1
        // for(int i = 1; i <= 20; i = i + 2) {
        //     System.out.println(i);
        // }

    //Exercice 2
        // int i = 0;
        // int sum = 0;
        // // int x = 10;
        // while(i<= 10) {
        //     sum += i;
        //     System.out.println(sum);
        //     i++;
        // }

    // //Exercice 3
    // do {

    // }while(i );

    // //Exercice 4
    // for(int i = 1; i <= 10 ; i= sum) {};
    
}

}
