import java.util.Scanner;
class prime{
     public int next(int a){
        int num=a+1;
        while(true){
            if(isprime(num)){
                return num;
            }
            num++;
        }

    }
    public boolean isprime(int num){
        if(num<=1) return false;
        for(int i=2;i<=num/2;i++){
            if(num % i==0){
                return false;
            }
        }
        return true;
    }
}



public class nextprime {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner adhi= new Scanner(System.in);
        prime p = new prime();
        int number = adhi.nextInt();
        System.out.println("The next prime number is "+p.next(number));
        adhi.close();
    }


}
