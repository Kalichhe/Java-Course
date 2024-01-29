package Sentences.Exercise;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        // Aceptacion
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingresa tu nota: ");
        int nota = scanner.nextInt();
        System.out.print("Ingresa tu sexo: ");
        String sexo = scanner.next();
        System.out.println(sexo);

        aceptacion(edad,nota,sexo);
    }

    public static void aceptacion(int edad, int nota, String sexo){
        if (edad >= 18 && nota >= 5 && sexo.toUpperCase().equals("M")){
            System.out.println("POSIBLE");
        } else if (edad >= 18 && nota >= 5 && sexo.toUpperCase().equals("F")) {
            System.out.println("POSIBLE");
        } else {
            System.out.println("NO ACEPTADA");
        }
    }
}
