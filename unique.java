import java.util.*;

import javax.swing.event.TreeModelEvent;

public class unique {
    public static void main(String[] args){
        Integer[] aa= {20,25,30,25,30,25,60,60,50,05,50,50,50,69,75,24,5,20,75,75,69};
        Map<Integer,Integer> adhi = new TreeMap<>();
        for(Integer i:aa){
            adhi.put(i,adhi.getOrDefault(i,0)+1);
        }
        System.out.println(adhi);
        for(Integer in :adhi.keySet()){
            if(adhi.get(in)==1){
                System.out.println("Unique value ="+in+":"+adhi.get(in));
            }
        }
        int maxkey=0,maxvalue=0;
        for(Integer ss : adhi.keySet()){
            if(maxvalue<adhi.get(ss)){
                maxvalue = adhi.get(ss);
                maxkey = ss;
            }
        }
        System.out.println("Maximum value = "+maxkey+":"+maxvalue);
        
    }
    
    
}
