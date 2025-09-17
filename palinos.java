import java.util.Scanner;
public class palinos {
    public static Boolean palino(int a){
        int rev = 0,n,oo = a;
        while(a!=0){
          n = a%10;
          rev = rev *10 + n;
          a = a/10;

        }
        Boolean s =(oo==rev)? true : false;
        return s;

    }
    public static void main(String[] args){
        System.out.print("Enter the number:");
        Scanner adhi = new Scanner(System.in);
        int no = adhi.nextInt();
        System.out.println("Palindrome = "+palino(no));
        adhi.close();
    }
    
}
