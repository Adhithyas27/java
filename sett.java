import java.util.*;
public class sett {
    public static void main(String[] args){
        int[] a = {24,24,24,24,25,25,68,58,5,5,5,888,8};
        HashSet<Integer> adhi = new HashSet<>();
        for(int aa : a){
            adhi.add(aa);
        }
        for(Integer ii : adhi){
            System.out.println(ii);
        }
        System.out.println(adhi.contains(888)+"\n\n");
        Iterator<Integer> it = adhi.iterator();
        while(it.hasNext()){
            System.out.print(" "+it.next());
        }
        
    }
    
}
