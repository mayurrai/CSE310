import java.util.Scanner;

public class Main {
    double totalBill;
    double babuAmount;
    double goliAmount;

    public Main(double totalBill) {
        this.totalBill = totalBill;
    }

    public boolean isValidInput() {
        return totalBill >= 200.0 && totalBill <= 4000.0;
    }

    public void calculateAmounts() {
        babuAmount = 0.75 * totalBill;
        goliAmount = 0.25 * totalBill ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalBill = scanner.nextDouble();
        Main main = new Main(totalBill);
        if (!main.isValidInput()) {
            System.out.println("Invalid Input");
            return;
        }
        main.calculateAmounts();
        System.out.printf("%.2f %.2f\n", main.babuAmount, main.goliAmount);
    }
}
