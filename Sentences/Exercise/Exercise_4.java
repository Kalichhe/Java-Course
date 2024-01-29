package Sentences.Exercise;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        // String
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the string");
        String stringw = scanner.next();

        strings(stringw);
    }

    public static void strings(String string) {
        String validate = string.toUpperCase();
        if (string == validate) {
            System.out.println("Yes is Upper");
        } else {
            System.out.println("Not is Upper");
        }
    }
}
