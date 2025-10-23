class Cos{
    int n;
    String s;
    Cos(int n,String s){
        System.out.println("Constructer is initialized ");
        this.n=n;
        this.s=s;

    }

}


public class constructer {
    public static void main(String[] args) {
        System.out.println("Hello  you");
        Cos c = new Cos(10,"Adhith ya");
        System.out.println(c.n);
        System.out.println(c.s);
        
    }
    
}
