import java.util.Scanner;


public class factwhile {
    public static void main(String[] args){
        int fact=1;
        Scanner adhi=new Scanner(System.in);
        System.out.print("Enter the factorial number:");
        int num = adhi.nextInt();
        while(num!=0){
            fact*=num;
            num--;
        }
        System.out.println("Factorial is "+fact);
        adhi.close();

    }
    
}
