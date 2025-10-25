class A
{
    public int calc(int a,int b)
    {
        return a+b;
    }
} 
class B extends A
{
  public int calc(int a ,int b )
  {
    return a+b+1;
  }
}
public class override {
    public static void main(String[] args)
    {
        A obj = new A();
        int sum1 = obj.calc(1,2);
        obj = new B();
        int sum2 = obj.calc(1,2);
        System.out.println("Sum 1:"+sum1+"\nSum 2:"+sum2);
    }
    
}
