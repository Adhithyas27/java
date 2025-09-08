import java.util.*;
public class posnegzer {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner adhi=new Scanner(System.in);
        int num= adhi.nextInt();
        if(num==0){
            System.out.println("It is zero");
        }
        else if(num>0){
            System.out.println("it is positive number");
        }
        else{
            System.out.println("it is negative number");
        }
        adhi.close();


    }
    
}
