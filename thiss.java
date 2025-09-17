import java.util.Scanner;
class Inc{
    int age;
    String name;

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
public class thiss {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner adhi = new Scanner(System.in);
        Inc var = new Inc();
        var.setAge(adhi.nextInt());
        System.out.println("the age is " + var.getAge());
        adhi.close();


    }
    
    
}
