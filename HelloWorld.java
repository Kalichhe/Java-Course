import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner output = new Scanner(System.in);
        String name = output.next();
        System.out.println("Hello, " + name);
    }
}