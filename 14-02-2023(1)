import java.util.Scanner;

public class day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int [] arr = new int[100];
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Invalid Array Size");
            System.exit(0);
        }
        else {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        }
        int sum = 0;
        int multi = 1;
        int choice = sc.nextInt();
        for(int i=0; i<n; i++) {
            sum = sum + arr[i];
            multi = multi*arr[i];
        }
        if(choice == 1){
            System.out.println(sum);
        } else if (choice == 2) {
            System.out.println(multi);
        } else {
            System.out.println("Wrong Choice");
        }
    }
}
