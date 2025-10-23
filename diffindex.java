import java.util.*;

class max{
    int maxi(String s,int len){
        int sum =0;
        char old[] = new char[len];
        char sort[] = new char[len];
        for(int i=0;i<len;i++){
            old[i] = s.charAt(i);
            sort[i] = s.charAt(i);
        }
        Arrays.sort(sort);
        System.out.println(Arrays.toString(old));
        System.out.println(Arrays.toString(sort));
        boolean used[] = new boolean[len];

        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                 if (!used[j] && old[i] == sort[j]) {
                    if
                    int diff = i - j;
                    sum += diff;
                    used[j] = true; // Mark this sorted index as used
                    break; // move to next character
             
                }
            }
        }
        return sum;


    }
}
public class diffindex {
    public static void main(String[] args) {
        System.out.println(("Enter the string:"));
        Scanner adhi = new Scanner(System.in);
        String a = adhi.nextLine();
        max m = new max();
        System.out.println("MAX : "+m.maxi(a,a.length()));
        adhi.close();

    }
    
}
