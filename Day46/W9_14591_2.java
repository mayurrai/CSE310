import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a > 0 && b > 0 && c > 0 && a <= 20 && b <= 20 && c <= 20) {
                if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                    System.out.println("Valid Triangle");
                } else {
                    throw new InvalidRightAngleTriangle("Invalid Triangle");
                }
            } else {
                throw new InvalidRightAngleTriangle("Invalid Input");
            }

        } catch (InvalidRightAngleTriangle e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

class InvalidRightAngleTriangle extends Exception {
    public InvalidRightAngleTriangle(String message) {
        super(message);
    }
}