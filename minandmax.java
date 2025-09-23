import java.util.Scanner;
class maxmin{
    int maxi(int[] a){
        int max = 0;
        for(int n:a){
            if(n>max){
                max = n;
            }

        }
        return max;
    }
     int mini(int[] a){
        int min = a[0];
        for(int n:a){
            if(n<min){
                min = n;
            }

        }
        return min;
    }
}

public class minandmax {
    public static void main(String[] args){
        System.out.println("Enter the number of elements in the array:");
        Scanner adhi = new Scanner(System.in);
        int a = adhi.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter the element in index:"+i);
            arr[i] = adhi.nextInt();
        }
        adhi.close();
        maxmin m = new maxmin();
        System.out.println("maximum="+m.maxi(arr));
        System.out.println("maximum="+m.mini(arr));


    }
    
}

    

