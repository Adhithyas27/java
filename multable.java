import java.util.Scanner;
public class multable {
    public static void main(String[] args){
        int i=1;
        Scanner adhi = new Scanner(System.in);
        System.out.print("Enter the multiplication table:");
        int num=adhi.nextInt();
        do{
            System.out.println(num + " X " + i + " = "+(num*i));
            i++;

        }while(i<=10);
        adhi.close();
    }
    
}
