/**
 * @author aaron
 * @version 1.1
 */
public class Recursive {
    /**
     *
     * @param n is the int submitted in the fibonacci sequence
     *          (example can be 5, as in the
     *          5th number within the fibonacci sequence.)
     * @return the fibonacci number found in spot n after completing the
     * recursion method (fib(n-1)+fib(n-2)
     */
    static int fib(int n) {
        if (n <=1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);

    }

    /**
     *
     * @param args main function beginning at 0 and performing the fibonacci sequence up to the nth term
     *            which was declared '10' then printing the 10th term
     *            result with a pre-worded declaration.
     */
    public static void main(String[] args) {
        int n = 10;
       System.out.println("The 10th term of the Fibonacci sequence is "+fib(n));
    }
}