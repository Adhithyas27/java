import java.util.Scanner;

public class reversestr {
    public static void main(String[] args) {
        Scanner adhi = new Scanner(System.in);

        System.out.println("Enter the string:");
        String aa = adhi.nextLine();
        for (int i = aa.length() -1 ; i >= 0; i--) {
            System.out.print(aa.charAt(i));
        }

        adhi.close();
    }
}
