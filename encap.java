class Human{
    private int number;
    private String name;

    public void setNumber(int a){
        this.number = a;
    }
    public void setName(String b){
        this.name = b;
    }
    public int getNumber(){
        return number;
    }
     public String getName(){
        return name;
    }
}

public class encap { 
    public static void main(String[] args){
        Human h1 = new Human();
        h1.setName("Adhithya");
        h1.setNumber(9000);
        System.out.println(h1.getName() + " get");
        System.out.println(h1.getNumber() + " get");
        
    }
    
}
