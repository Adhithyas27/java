import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner adhi=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=adhi.nextInt();
        Boolean isprime=true;
        if(num<=1){
            isprime=false;
        }
        else{
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    isprime=false;
                    break;
                }
            }
        }
        String a=isprime? "It is prime number" : "It is not a prime number";
        System.out.println(a);
        adhi.close();
    }
}
