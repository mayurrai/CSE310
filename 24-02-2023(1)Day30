import java.util.Scanner;

class ProvidentFund {
    private String idProof;
    private String name;
    private String accountNumber;
    private static int countAadhar = 101;
    private static int countPan = 101;

    ProvidentFund(String name, String idProof, String idNumber) {
        this.name = name;
        this.idProof = idProof;

        if (idProof.equals("A")) {
            this.accountNumber = "A" + countAadhar;
            countAadhar++;
        } else if (idProof.equals("P")) {
            this.accountNumber = "P" + countPan;
            countPan++;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String idProof = scanner.next();
            scanner.nextLine();
            String idNumber = scanner.nextLine();

            ProvidentFund pf = new ProvidentFund(name, idProof, idNumber);
            System.out.println(pf.getAccountNumber());
        }
    }
}
