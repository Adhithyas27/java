public class stringjava {
    public static void main(String[] args){
        String adhi = "Hello you";
        String aa = "HELLO YOU";
        System.out.println("TRIM = "+adhi.trim());
        System.out.println("CharAt = "+adhi.charAt(1));
        System.out.println("concat = "+adhi.concat("adhi"));
        System.out.println("equals = "+adhi.equals(aa));
        System.out.println("equalsIgnoreCase = "+adhi.equalsIgnoreCase(aa));
        System.out.println("contains = "+adhi.contains("lo y"));
        System.out.println("startswith = "+adhi.startsWith("H"));
        System.out.println("endswith = "+adhi.endsWith("u"));
        System.out.println("upper case = "+adhi.toUpperCase());
        System.out.println("lower case = "+adhi.toLowerCase());
        System.out.println("replace = "+adhi.replace("Hello","Shit"));
        System.out.println("substring = "+adhi.substring(2,5));


   
        
    }
    
}
