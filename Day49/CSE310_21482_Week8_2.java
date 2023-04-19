import java.util.Scanner;

public class IsoscelesTriangleValidator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int side1 = scanner.nextInt();

        int side2 = scanner.nextInt();

        int side3 = scanner.nextInt();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0|| side1>10 || side2>10 ||side3 >10) {

            System.out.println("Invalid Input");

        } else if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {

            System.out.println("Invalid Triangle");

        } else if (side1 == side2 || side1 == side3 || side2 == side3) {

            System.out.println("Valid Isosceles Triangle");

        } else {

            System.out.println("Invalid Isosceles Triangle");

        }

    }

}