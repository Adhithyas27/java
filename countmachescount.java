import java.util.*;
public class countmachescount {
    public static void main(String[] args) {
        int[] a = {4,4,4,4,5,5,5,5,5,6,6,2,2,1,1};
        HashMap<Integer,Integer> list=new HashMap<>();
        for(int i:a){
            list.put(i,list.getOrDefault(i,0)+1);
        }
        for(Integer i:list.keySet()){
            if(i==list.get(i)){
                System.out.println("Satisfy"+i);
            }

        }
        
    }
    
}
