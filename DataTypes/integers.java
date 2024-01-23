package DataTypes;

public class integers {
    public static void main(String[] args) {
        // Types of integers

        // Byte
        byte byteNegative = -128;
        byte bytePositive = 127;

        System.out.println("Lo mas negativo que puede llegar el byte es: " + byteNegative);
        System.out.println("Lo mas positivo que puede llegar el byte es: " + bytePositive);

        // short
        short shortNegative = -32768;
        short shortPositive = 32767;

        System.out.println("Lo mas negativo que puede llegar el short es: " + shortNegative);
        System.out.println("Lo mas positvo que puede llegar el short es: " + shortPositive);

        // int
        int intNegative = -2147483648;
        int intPositive = 2147483647;

        System.out.println("Lo mas negativo que puede llegar el int es: " + intNegative);
        System.out.println("Lo mas positivo que puede llegar el int es: " + intPositive);

        // long
        long longNegative = -9223372036854775808L;
        long longPositive = 9223372036854775807L;
        System.out.println("Lo mas negativo de long es: " + longNegative);
        System.out.println("Lo mas positivo de long es: " + longPositive);
    }
}
