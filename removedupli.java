import java.util.Scanner;
import java.util.Arrays;

class rem{
    int[] remm(int[] a){
        int j = 0;
        Arrays.sort(a);
        int[] temp = new int[a.length];
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                temp[j++]=a[i];
            }
        }
        temp[j++] = a[a.length - 1];
        return Arrays.copyOf(temp,j);

    }
}

public class removedupli {
    public static void main(String[] args){
        System.out.println("Enter the number of elements in the array:");
        Scanner adhi = new Scanner(System.in);
        int a = adhi.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter the element in index:"+i);
            arr[i] = adhi.nextInt();
        }
        rem aa = new rem();
        int[] nd = aa.remm(arr);
        String s = Arrays.toString(nd);
        System.out.println("unique elements are "+s);
        adhi.close();

    
}
}
