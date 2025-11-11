import java.util.ArrayList;
import java.util.Arrays;

public class arlilst {
    public static void main(String[] args){
        Integer[] a = {52,55,86,24,25,756,24,2578};
        ArrayList<Integer> adhi = new ArrayList<>(Arrays.asList(a));
        for(Integer aa : adhi){
            System.out.println(aa);
        }
        System.out.println(adhi.get(2));
        System.out.println(adhi.indexOf(2578));
        
    }
    
}
