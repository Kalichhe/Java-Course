package Sentences.Exercise;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        //Potencia de un numero

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number");
        int number = scanner.nextInt();
        System.out.println("Insert the exponent");
        int exponent = scanner.nextInt();

        potenciaNumero(number, exponent);
    }

    public static void potenciaNumero(int number, int exponent){
        if (exponent > 0){
            System.out.println("La potencia es: " + Math.pow(number, exponent));
        } else if (exponent == 0) {
            System.out.println("La potencia es: " + Math.pow(number, exponent));
        } else {
            int exponentPositive = exponent * -1;
            System.out.println("La potencia es: " + 1/(Math.pow(number,exponentPositive)));
        }
    }
}
