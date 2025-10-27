abstract class Mainn
{
    public abstract void driving();
    public abstract void flying();
}

class Conc extends Mainn
{
    public void flying(){
        System.out.println("flying...");
    }
    public void driving(){
        System.out.println("Driving...");
    }
}



public class abs 
{
    public static void main(String[] args){
        Conc adhi = new Conc();
        adhi.driving();
        adhi.flying();
        

    }

    
}
