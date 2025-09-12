class name{
    int number;
    int phone;

    static{
        int roll = 85220;
        System.out.println("Static is initialized");
    }

    name(int n,int p){
        System.out.println("Constructor is initialized and variable assigned number is "+n+" "+p);
    }
    
}

public class constructon {
    public static void main(String[] args){
        name n1 = new name(2,7);
        name n2 = new name(9,2);
        name n3 = new name(4,1);
        name n4 = new name(4,9);

    }
    
}
