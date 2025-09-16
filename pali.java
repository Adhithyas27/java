import java.util.Scanner;
class palindrome{
    private String s1;
     palindrome(String s2){
       s1 = s2;

    }
    public Boolean ispali(){
        int length = s1.length();
        for(int i=0;i<length;i++){
            if(s1.charAt(i)!= s1.charAt(length -1 - i)){
                return false;
            }

        }
        return true;
        
    }
}

public class pali {
    public static void main(String[] args){
        Scanner adhi = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s1 = adhi.nextLine();
        palindrome p1 = new palindrome(s1);
        System.out.println("palindrome = "+p1.ispali());
        adhi.close();

    }
}
