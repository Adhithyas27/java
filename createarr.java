import java.util.Scanner;
public class createarr {
    public static void main(String[] args){
        Scanner adhi=new Scanner(System.in);

        System.out.println("Enter the numbers of element:");
        int n=adhi.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=adhi.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(i+" - "+arr[i]);
        }

        adhi.close();

    }
    
}
