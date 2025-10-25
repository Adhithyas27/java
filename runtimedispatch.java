 class A
    {
        public void show()
        {
            System.out.println("IN A");
        }
    }
    class B extends A
    {
        public void show()
        {
            System.out.println("IN B");
        }
    }
    class C extends A
    {
        public void show()
        {
            System.out.println("IN C");
        }
    }  


public record runtimedispatch() {
   
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        obj = new B();
        obj.show();
        obj = new C();
        obj.show();
    }      
}

