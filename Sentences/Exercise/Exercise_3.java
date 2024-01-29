package Sentences.Exercise;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        float firstNumber = scanner.nextFloat();
        System.out.println("Enter the second number");
        float secondNumber = scanner.nextFloat();
        System.out.println("");

        // Division
        float division = division(firstNumber, secondNumber);
        System.out.println("The division is: " + division + "\n");
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
