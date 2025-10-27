class A{
    public void show(){
        System.out.println("Showing...");
    }
    class B{
        public void config(){
            System.out.println("configing...");
        }
    }
}

public class innerclass {
    public static void main(String[] args){
        A obj = new A();
        obj.show();
        A.B adhi = obj.new B();
        adhi.config();

    }
    
}
