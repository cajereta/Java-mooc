
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        scanner.close();

        int sumResult = first + second;
        int subtractionResult = first - second;
        int multiplicationResult = first * second;
        double divisionResult = 1.0 * first / second;

        System.out.println(first + " + " + second + " = " + (sumResult));
        System.out.println(first + " - " + second + " = " + (subtractionResult));
        System.out.println(first + " * " + second + " = " + (multiplicationResult));
        System.out.println(first + " / " + second + " = " + (divisionResult));
    }
}
