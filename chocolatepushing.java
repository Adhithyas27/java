import java.util.Arrays;
import java.util.Scanner;
class Push{
    public String pushh(int[] aa,int n){
        int j=0;
        for(int i=0;i<n-1;i++){
            if(aa[i]!=0){
                aa[j++]=aa[i];   
            }
        }
        while(j<n){
            aa[j++]=0;
        }
        // 5 0 5 0 2 0 5 6 9 8 4 2
        // 5 5 2 5 6 9 8 4 2 0 0 0 
        return Arrays.toString(aa);

    }
}
public class chocolatepushing {
    public static void main(String[] args){
        System.out.println("Enter the elements in the array:");
        Scanner adhi = new Scanner(System.in);
        int n = adhi.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" th element");
            a[i] = adhi.nextInt();
        }
        Push p = new Push();
        System.out.println(p.pushh(a, n));

    }
    
}
