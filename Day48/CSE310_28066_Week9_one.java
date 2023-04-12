import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int op = scanner.nextInt();

        Calculator calculator = null;
        switch (op) {
            case 1:
                calculator = (x, y) -> x + y;
                break;
            case 2:
                calculator = (x, y) -> x - y;
                break;
            case 3:
                calculator = (x, y) -> x * y;
                break;
            case 4:
                calculator = (x, y) -> x / y;
                break;
            default:
                System.out.println("Invalid");
                return;
        }

        int result = calculator.calculate(a, b);
        System.out.println(result);
    }
}

interface Calculator {
    int calculate(int a, int b);
}
