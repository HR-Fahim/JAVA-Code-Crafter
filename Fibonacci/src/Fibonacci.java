public class Fibonacci {

    // Recursive method to calculate 
    public static int fibonacci(int n) {
        System.out.println("Entering fibonacci(" + n + ")");
        if (n <= 1) {
            System.out.println("Returning " + n + " from fibonacci(" + n + ")");
            return n;
        }
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        System.out.println("Returning " + result + " from fibonacci(" + n + ")");
        return result;
    }

    public static void main(String[] args) {
        int n = 3; 
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}
