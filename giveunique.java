import java.util.*;
public class giveunique {
public static void main(String[] args){
    int[][] a={{25,8,5,28},{8,25,28,8}};
    TreeMap<Integer,Integer> adhi = new TreeMap<>();
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            adhi.put(a[i][j],adhi.getOrDefault(a[i][j],0)+1);
        }
    }
    System.out.println(adhi);
    for(Integer aa : adhi.keySet()){
        if(adhi.get(aa)==1){
            System.out.println(aa+":"+adhi.get(aa));
        }
        if(ad)

    }
    
}
    
}
