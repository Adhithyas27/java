import java.util.*;

class Primes {
    public boolean isPrime(int s) {
        if (s <= 1) {
            return false;
        }
        for (int i = 2; i * i <= s; i++) {
            if (s % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int primeSum(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
}

public class primesum {
    public static void main(String[] args) {
        Scanner adhi = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = adhi.nextInt();
        Primes pp = new Primes();
        System.out.println("Sum of primes up to " + n + " is: " + pp.primeSum(n));
    }
}
