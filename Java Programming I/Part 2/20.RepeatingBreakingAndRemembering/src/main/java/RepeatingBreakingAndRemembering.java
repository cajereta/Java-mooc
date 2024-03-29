
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        int countEven = 0;
        int countOdd = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                System.out.println("Thx! Bye!");

                break;
            }

            if (input % 2 == 0) {
                countEven = countEven + 1;
            } else {
                countOdd = countOdd + 1;
            }
            sum += input;
            count = count + 1;

        }
        System.out.println("Sum now: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + 1.0 * sum / count);
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);
    }
}
