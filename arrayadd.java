import java.util.Scanner;

class add{
    int addarr(int[] a){
        int sum = 0;
        for(int num :a){
            sum += num;


        }
        return sum;
    }
}
public class arrayadd {
    public static void main(String[] args){
        System.out.println("Enter the number of elements in the array:");
        Scanner adhi = new Scanner(System.in);
        int a = adhi.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter the element in index:"+i);
            arr[i] = adhi.nextInt();
        }
        add ad = new add();    
        System.out.println("Sum of array = "+ad.addarr(arr));
        adhi.close();


    }
    
}
