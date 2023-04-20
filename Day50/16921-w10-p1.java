import java.util.Scanner;

class PasswordFormatException extends Exception {
    public PasswordFormatException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();

        try {
            validatePassword(password);
            System.out.println("Password Accepted");
        } catch (PasswordFormatException e) {
            System.out.println("Invalid");
        }
    }

    public static void validatePassword(String password) throws PasswordFormatException {
        if (password.length() <= 5) {
            throw new PasswordFormatException("Password length should be greater than 5");
        }

        boolean hasDigit = false;
        boolean hasChar = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (Character.isLetter(c)) {
                hasChar = true;
            }
        }
        if (!hasDigit || !hasChar) {
            throw new PasswordFormatException("Password should contain at least 1 digit and 1 character");
        }
    }
}
