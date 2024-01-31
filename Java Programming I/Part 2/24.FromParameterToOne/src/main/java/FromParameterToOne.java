import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());
        scanner.close();
        printFromNumberToOne(input);
    }

    public static void printFromNumberToOne(int number) {
        int i = 0;

        while (i < number) {
            System.out.println(number - i);
            i++;
        }
    }
}
