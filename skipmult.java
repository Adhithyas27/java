import java.util.Scanner;
public class skipmult {
    public static void main(String[] args){
        Scanner adhi=new Scanner(System.in);
        System.out.println("Enter the range:");
        int range=adhi.nextInt();
        for(int i=0;i<=range;i++){
            if(i%2==0 || i%5==0){
                continue;
            }
            System.out.print(i+" ");
        }
        adhi.close();
    }
    
}
