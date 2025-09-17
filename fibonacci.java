import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        int num1 = 0,num2 = 1,sum;
        System.out.println("Enter the number");
        Scanner adhi = new Scanner(System.in);
        int num = adhi.nextInt();
        System.out.print(num1+" "+num2);
        for(int i=0;i<=num;i++){
            sum = num1 + num2;
            System.out.print(" "+sum);
            num1 = num2;
            num2 = sum;
            
        }
        adhi.close();
    }
    
}
