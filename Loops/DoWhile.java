package Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // Do While
        doWhile();
    }

    public static void doWhile() {
        int option;
        do{
            System.out.println("Hello, select a option");
            System.out.println("1: Print 'Hello World'");
            System.out.println("2: Print 'Good Bye'");
            System.out.println("3: Exit");

            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();

            switch (option){
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
        } while (option != 3);
    }
}
