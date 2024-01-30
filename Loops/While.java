package Loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        While();
    }

    // Ternary operator
    // variable = (variable)?si si:si no;
    public static void While() {
        int option = 0;
        while (option != 3) {

            System.out.println("Hello, select a option");
            System.out.println("1: Print 'Hello World'");
            System.out.println("2: Print 'Good Bye'");
            System.out.println("3: Exit");

            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Hello World");
                    break;
                case 2:
                    System.out.println("Good Bye");
                    break;
                case 3:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("This option is not available");
            }
        }
    }

}
