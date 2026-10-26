
import java.util.Scanner;

public class Task7{

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double fn = input.nextDouble();

        System.out.print("Enter second number: ");
        double sn = input.nextDouble();

        System.out.println("\nResults:");
        System.out.println("Addition: " + add(fn, sn));
        System.out.println("Subtraction: " + subtract(fn, sn));
        System.out.println("Multiplication: " + multiply(fn, sn));
        System.out.println("Division: " + divide(fn, sn));

        input.close();
    }
}
