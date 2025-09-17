import java.util.Scanner;
public class numerology {
    public static int num(String a){
        int sum=0 , asci,index;
        int len = a.length();
        for(int i=0;i<len;i++){
            index = i+1;
            asci = (int)a.charAt(i);
           if(asci%2==1 || index %2==1){
              sum+=asci * index;
           }
        }
        return sum;

    }
    public static void main(String[] args){
        System.out.print("Enter the word:");
        Scanner adhi = new Scanner(System.in);
        String name = adhi.nextLine();
        System.out.println("Lucky number = "+num(name));
        adhi.close();
    }
    
}
