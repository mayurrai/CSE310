import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] prices = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            prices[i] = sc.nextInt();
        }
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if (price < minPrice) {
                minPrice = price;
            }
            if (price > maxPrice) {
                maxPrice = price;
                maxIndex = i;
            }
        }
        prices[maxIndex] = minPrice;
        for (int element : prices)
            System.out.print(element + " ");
    }
}
