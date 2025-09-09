import java.util.Scanner;

class calc{
    public int add(int a,int b){
        return a+b;
    }
}
public class calcobject 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        calc cal=new calc();
        System.out.println("Enter the first number:");
        int n1=scan.nextInt();
        System.out.println("Enter the second number:");
        int n2=scan.nextInt();
        System.out.println(cal.add(n1,n2));
        scan.close();

    }

    
}
