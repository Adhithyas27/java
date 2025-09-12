class ss{
    int number = 9;
    String name = "Adhi";
    static String place = "bangalore";

    public void show(){
        System.out.println("number = "+number+"\nname = "+name+"\nplace = "+place);
    }
}


public class staticvar {
    public static void main(String[] args){
        ss cl1 = new ss();
        ss cl2 = new ss();
        ss cl3 = new ss();
        cl3.place= "Chennai";
        System.out.println(cl1.place + " " + cl2.place + " " + cl3.place);


        

        

    }
    
}
