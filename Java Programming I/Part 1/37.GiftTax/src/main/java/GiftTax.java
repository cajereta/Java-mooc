
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");

        int valueOfGift = Integer.valueOf(scan.nextLine());
        scan.close();
        if (valueOfGift >= 5000 && valueOfGift < 25000) {
            System.out.println("Tax: " + (100 + (+valueOfGift - 5000) * 0.08));
        } else if (valueOfGift >= 25000 && valueOfGift < 55000) {
            System.out.println("Tax: " + (1700 + (valueOfGift - 25000) * 0.1));
        } else if (valueOfGift >= 55000 && valueOfGift < 200000) {
            System.out.println("Tax: " + (4700 + (valueOfGift - 55000) * 0.12));
        } else if (valueOfGift >= 200000 && valueOfGift < 1000000) {
            System.out.println("Tax: " + (22100 + (valueOfGift - 200000) * 0.15));
        } else if (valueOfGift > 1000000) {
            System.out.println("Tax: " + (142100 + (valueOfGift - 1000000) * 0.17));
        } else {
            System.out.println("No tax!");
        }
    }
}
