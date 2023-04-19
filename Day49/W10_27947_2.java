import java.util.Scanner;

class quesn2 extends Exception {

    public quesn2(String message) {

        super(message);

    }

}

public class IsoscelesTriangleChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            int side1 = scanner.nextInt();

            int side2 = scanner.nextInt();

            int side3 = scanner.nextInt();

            if (side1 > 10 || side2 > 10 || side3 > 10) {

                throw new IllegalArgumentException("Invalid Input");

            }

            if (side1 == side2 && side1 != side3 || side1 == side3 && side1 != side2 || side2 == side3 && side2 != side1) {

                System.out.println("Valid Isosceles Triangle");

            } else {

                throw new quesn2("Invalid Isosceles Triangle");

            }

        } catch (quesn2 e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Invalid Input");

        }

    }

}