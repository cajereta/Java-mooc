public class AdvancedAstrology {
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i * 2 - 1);
        }
    }

    public static void printBase(int height) {
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void christmasTree(int height) {
        printTriangle(height);
        printBase(height);
    }

    public static void main(String[] args) {
        printSpaces(1);
        System.out.println("");
        printTriangle(1);
        System.out.println("---");
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
