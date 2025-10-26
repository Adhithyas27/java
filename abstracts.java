abstract class OldCar{
    public void playMusic(){
        System.out.println("Music is playing");
    }
    public abstract void driving();
    public abstract void flying(); 
}
abstract class Car extends OldCar{
    public void driving(){
        System.out.println("Car is driving");
    }
}
class NewCar extends Car{
    public void flying(){
        System.out.println("Car is flying");
    }
}


public class abstracts {
    public static void main(String[] args){
    NewCar obj = new NewCar();
    obj.flying();
    obj.driving();
    }
    
}
