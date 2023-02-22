
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void primeFactors(int n) {
        int c = 2;
        HashMap<Integer, Boolean> visited = new HashMap<>();
        for (int i = 0; i < n; i++) visited.put(i, false);
        while (n > 1) {
            if (n % c == 0) {
                if (visited.containsKey(c)) {
                    if (!visited.get(c)) {
                        System.out.print(c + " ");
                        visited.put(c, true);
                    }
                }
                n /= c;
            } else c++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 10 && n < 50) {
            primeFactors(n);
        } else {
            System.out.println("Invalid Input");
            System.exit(0);
        }
    }
}
