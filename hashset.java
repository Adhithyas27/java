import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class hashset {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,2,2,3,4,4,4,4,7};
        LinkedHashSet<Integer> list = new LinkedHashSet<>(Arrays.asList(arr));
        list.add(90);
        list.remove(90);
        System.out.println(list);
        
        
    }
}
