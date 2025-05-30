package TEST;

public class FibonacciSeries {
	
	
    public static void main(String[] args) {
        int n = 20; // Number of terms to print
        int first = 0, second = 1;

        

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Compute next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
}	