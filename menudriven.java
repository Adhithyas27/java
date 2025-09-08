import java.util.Scanner;
public class menudriven {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner adhi=new Scanner(System.in);
        int a=adhi.nextInt();
        System.out.println("Enter the operation\n1,even or odd\n2,Square\n3,Cube\n4,Exit");
        int op=adhi.nextInt();
        switch(op){
            case 1:
                String eoro=a%2==0? "even" : "odd";
                System.out.println(eoro);
                break;
            case 2:
                System.out.println(op*op);
                break;
            case 3:
                System.out.println(op*op*op);
                break;
            case 4:
                System.out.println("Exiting the program");
                System.exit(0);
                break;
            default:
                System.out.println("Enter the correct input");
        }
        adhi.close();

    }
    
}
