import java.util.*;

class enc{
    String encc(String s){
        StringBuilder sb = new StringBuilder();
        s=s.toLowerCase();

        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if('a'<= c && 'z'>=c){
                c=(char)('a'+(c-'a'-1+26)%26);
 
                sb.append(c);
            }
            

        }
        return sb.toString();
    
}
}
public class cryptographer {
    public static void main(String[] args) {
        System.out.println("Enter the letter");
        Scanner adhi = new Scanner(System.in);
        String ss = adhi.nextLine();
        enc aaa = new enc();
        System.out.println("DEC:"+aaa.encc(ss));

        
        adhi.close();


        
    }
    
}
