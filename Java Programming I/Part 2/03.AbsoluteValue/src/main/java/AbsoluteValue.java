
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.valueOf(scanner.nextLine());
        scanner.close();

        if (a < 0) {
            System.out.println(-a);
        } else {
            System.out.println(a);
        }

    }
}
