import java.util.Scanner;
public class hackerrank{

     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        
        if(n<0){
            System.out.println("Invalid Array Size");
        }
        else{
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
        
        for(int i=0;i<n;i++){
            if(arr[i]<0)
            {
                System.out.println("Invalid Array Elements");
                System.exit(0);
            }
            else
            {
                for(int j=i+1;j<n;j++) 
                {
                    if(arr[i]<arr[j])
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
                System.out.println(arr[1]);
        
        
    }
        sc.close();
    }
}
