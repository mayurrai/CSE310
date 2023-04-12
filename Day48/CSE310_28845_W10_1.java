import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int waistSize = scanner.nextInt();
            if (waistSize < 18 || waistSize > 40) {
                throw new UnexpectedTrouserSizeException();
            } else {
                System.out.println("try and shop");
            }
        } catch (UnexpectedTrouserSizeException e) {
            System.out.println("the demanded size is out of stock");
        } catch (Exception e) {
            System.out.println("invalid input");
        }
    }
}

class UnexpectedTrouserSizeException extends Exception {
}
