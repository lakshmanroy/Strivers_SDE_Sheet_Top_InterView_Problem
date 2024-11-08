public class Pow_Power {
    public static double myPow(double x, int n) {
        // Base case: n == 0
        if (n == 0) {
            return 1.0;
        }

        // Handle negative powers
        if (n < 0) {
            x = 1 / x;  // Convert x to its reciprocal
            n = -n;     // Make n positive
        }

        // If n is even
        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        }

        // If n is odd
        return x * myPow(x, n - 1);
    }

    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        
        System.out.println(myPow(x, n));  // Output: 1024.0
    }
}
