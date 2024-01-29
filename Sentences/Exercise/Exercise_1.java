package Sentences.Exercise;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        // Two numbers
        Scanner scanner = new Scanner(System.in);
        // Number One
        System.out.println("Insert the first number");
        float numberOne = scanner.nextFloat();
        // Number Two
        System.out.println("Insert the second number");
        float numberTwo = scanner.nextFloat();

        twoNumbers(numberOne, numberTwo);

    }

    /**
     * Description: This is a program that validates if two numbers are equal or one greater than the other
     *
     * @param firstNumber This is the first number
     * @param secondNumber This is the second number
     *
     * */
    public static void twoNumbers(float firstNumber, float secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println("The number one " + firstNumber + " is greater than the number two " + secondNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("The number two " + secondNumber + " is greater than the number one " + firstNumber);
        } else {
            System.out.println("The two numbers are the same");
        }
    }
}
