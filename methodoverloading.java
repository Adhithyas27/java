class calac{
  public void add(int m,int n){
    System.out.println("Sum "+(m+n));
  }
   public void add(int m,int n,int o){
    System.out.println("Sum "+(m+n+o));
  }
}
public class methodoverloading {
    public static void main(String[] args) {
        calac calc=new calac();
        int a=10;
        int b=20;
        int c=90;
        calc.add(a,b);
        calc.add(a,b,c);
        
    }
    
}
