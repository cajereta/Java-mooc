
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");

        int number = scanner.nextInt();
        scanner.close();
        int i = 1;
        int factorial = 1;
        for (i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
