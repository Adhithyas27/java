import java.util.*;

public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> adhi = new ArrayList<>();
        adhi.add(0);
        adhi.add(1);
        adhi.add(2);
        adhi.add(3);
        adhi.add(4);
        adhi.add(5);

        Iterator<Integer> it = adhi.iterator();
        while(it.hasNext()){
            System.out.println("value:"+it.next());
        }
    }
    
}
