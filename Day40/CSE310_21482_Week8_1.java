import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int index = scanner.nextInt();
        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong Input");
        }
    }
}
