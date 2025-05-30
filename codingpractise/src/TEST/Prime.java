package TEST;

public class Prime {

    public static void main(String[] args) {

        int n = 12777;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;  // 0 and 1 are not prime
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;  // No need to check further
                }
            }
        }

        if (isPrime)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }
}
