import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size < 0) {
            System.out.println("Invalid Array Size");
            System.exit(0);
        } else {
            float[] array = new float[size];
            for (int i = 0; i < size; i++) {
                float n = sc.nextFloat();
                if (n < 0) {
                    System.out.println("Invalid Array Elements");
                    System.exit(0);
                } else {
                    array[i] = (int) n;
                }
            }
            int[] array2 = new int[size];
            for (int i = 0; i < array.length; i++)
                array2[i] = (int) array[i];
            for (int i = 0; i < array.length; i++)
                System.out.println(array2[i] + " ");
        }
    }
}
