import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String para = sc.nextLine().trim().toLowerCase();
        String word = sc.next().trim().toLowerCase();
        int n = sc.nextInt();
        int count = 0;
        int lastIndex = -1;
        for (int i = 0; i <= para.length() - word.length(); i++) {
            if (para.substring(i, i + word.length()).equals(word)) {
                count++;
                if (count == n) {
                    System.out.println(i);
                    return;
                }
                lastIndex = i;
            }
        }
        if (count == 0) {
            System.out.println("Not Present");
        } else {
            System.out.println(lastIndex);
        }
    }
}
