class A
{
    String name = "Adhithya";
    int no=25;

    public String toString() {
        return "name: " + name + ", number: " + no;
    }

}
public class printclass {
    public static void main(String[] args)
    {
        A obj = new A();
        System.out.println(obj);
    }
    
}
