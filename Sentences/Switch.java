package Sentences;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // Switch

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        int numOne = scanner.nextInt();
        System.out.println("Ingresa el segundo numero");
        int numTwo = scanner.nextInt();

        System.out.println("Elige una opcio: 1) Suma, 2) Resta, 3) Multiplicacion, 4) Division");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                int sum = numOne + numTwo;
                System.out.println("The sum is: " + sum);
                break;
            case 2:
                int subtraction = numOne - numTwo;
                System.out.println("The subtraction is: " + subtraction);
                break;
            case 3:
                int multiplication = numOne * numTwo;
                System.out.println("The multiplication is: " + multiplication);
                break;
            case 4:
                if (numOne < numTwo) {
                    System.out.println("The number one is less than the number two");
                } else {
                    int division = numOne / numTwo;
                    System.out.println("The division is: " + division);
                    break;
                }
            default:
                System.out.println("The option is not validated");
                break;
        }

    }
}
