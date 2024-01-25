package Funtions;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        float firstNumber = scanner.nextFloat();
        System.out.println("Enter the second number");
        float secondNumber = scanner.nextFloat();
        System.out.println("");

        // Addiction
        float addictions = addiction(firstNumber, secondNumber);
        System.out.println("The addiction is: " + addictions + "\n");

        // Subtraction
        float subtraction = subtraction(firstNumber, secondNumber);
        System.out.println("The subtraction is: " + subtraction + "\n");


        // Multiplication
        float multiplication = multiplication(firstNumber, secondNumber);
        System.out.println("The multiplication is: " + multiplication + "\n");


        // Division
        float division = division(firstNumber, secondNumber);
        System.out.println("The division is: " + division + "\n");

    }

    /**
     * Description: What this function does is make a sum between two numbers
     *
     * @param firstNumber This is the first number to add
     * @param secondNumber This is the second number to add
     *
     * @return This function return the sum between two numbers
     * */
    public static float addiction (float firstNumber, float secondNumber) {

        System.out.println("The first number is: " + firstNumber);
        System.out.println("The second number is: " + secondNumber);

        return firstNumber + secondNumber;
    }

    /**
     * Description: What this function does is make a subtraction between two numbers
     *
     * @param firstNumber This is the first number to subtract
     * @param secondNumber This is the second number to subtract
     *
     * @return This function return the subtraction between two numbers
     * */
    public static float subtraction (float firstNumber, float secondNumber) {

        System.out.println("The first number is: " + firstNumber);
        System.out.println("The second number is: " + secondNumber);

        return firstNumber - secondNumber;
    }

    /**
     * Description: What this function does is make a multiplication between two numbers
     *
     * @param firstNumber This is the first number to multiply
     * @param secondNumber This is the second number to multiply
     *
     * @return This function return the multiplication between two numbers
     * */
    public static float multiplication (float firstNumber, float secondNumber) {

        System.out.println("The first number is: " + firstNumber);
        System.out.println("The second number is: " + secondNumber);

        return firstNumber * secondNumber;
    }

    /**
     * Description: What this function does is make a division between two numbers
     *
     * @param firstNumber This is the first number to divide
     * @param secondNumber This is the second number to divide
     *
     * @return This function return the division between two numbers
     * */
    public static float division (float firstNumber, float secondNumber) {

        System.out.println("The first number is: " + firstNumber);
        System.out.println("The second number is: " + secondNumber);

        // Validations
        if (secondNumber == 0) {
            System.out.println("It is not possible");
            return 0;
        }
        return firstNumber / secondNumber;

    }
}
