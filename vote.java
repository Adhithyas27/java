import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner adhi=new Scanner(System.in);
        int a=adhi.nextInt();
        if(a>=18){
            System.out.println("you are eligible to vote");
        }
        else{
            System.out.println("you are not eligible to vote still wait "+(18-a)+" years");
        }

        adhi.close();
    }
    
}
