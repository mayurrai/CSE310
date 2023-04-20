import java.util.Scanner;

class InvalidTriangleException extends Exception {
    public InvalidTriangleException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a > 20 || b > 20 || c > 20) {
                throw new InvalidTriangleException("Invalid Input");
            }
            if (a + b > c && b + c > a && c + a > b) {
                System.out.println("Valid Triangle");
            } else {
                throw new InvalidTriangleException("Invalid Triangle");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
