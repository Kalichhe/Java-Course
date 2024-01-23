package Exercises;

public class Excercise_2 {
    public static void main(String[] args) {
        // Ejercicio 2
        //
        // Usando los dos tipos de casting que aprendiste (implícito y explícito), resuelve los siguientes casteos indicando qué tipo es y
        // si se está calculando estimación o exactitud.

        // char c = ‘z’; conviertelo a int
        char c = 'z';
        int z = (int) c;
        // Explicito, exactitud
        System.out.println(z);

        // int i = 250; conviertelo a long y luego de long a short
        int i = 250;
        long iLong = i;
        // Implicito, exactitud
        short iShort = (short) iLong;
        // Explicito, estimacion
        System.out.println(iLong);
        System.out.println(iShort);

        // double d = 301.067; conviertelo a long
        double d = 301.067;
        long dLong = (long) d;
        // Explicito, exactitud
        System.out.println(dLong);

        // int i = 100; súmale 5000.66 y conviertelo a float
        int iInt = 100;
        iInt += 5000.66;
        float iFloat = iInt;
        // Implicito, exactitud
        System.out.println(iFloat);

        // int i = 737; multiplícalo por 100 y conviertelo a byte
        int iI = 737;
        iI *= 100;
        byte iB = (byte) iI;
        // Explicito, exactitud
        System.out.println(iB);

        // double d = 298.638; divídelo entre 25 y conviertelo a long
        double dD = 298.638;
        dD /= 25;
        long dL = (long) dD;
        // Explicito, aproximado
        System.out.println(dL);
    }
}
