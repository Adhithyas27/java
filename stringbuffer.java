public class stringbuffer {
    public static void main(String[] args){
        StringBuffer adhi = new StringBuffer("Hello you");
        adhi.append(" Hi");
        adhi.deleteCharAt(2);
        adhi.insert(2," Adhi ");
        String gg = adhi.toString();
        System.out.println(gg.contains("Adhi"));
    }
    
}
