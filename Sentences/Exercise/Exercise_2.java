package Sentences.Exercise;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        // Par o impar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the first number");
        int firstNumber = scanner.nextInt();

        parImpar(firstNumber);
    }

    public static void parImpar(int firstNumber){
        if (firstNumber % 2 == 0) {
            System.out.println("The number " + firstNumber + " is par");
        } else {
            System.out.println("The number " + firstNumber + " is impar");
        }
    }
}
