import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Invalid");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num);
        } else {
            try {
                throw new NumberFormatException("NOT Prime");
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
