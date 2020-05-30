package resursion;

/** return the nth number in the fibonacci series, using recursion
 *  a   b   c = a + b
 *  1,  1,  2,  3,  5,  8, 13, 21, 34, 55....
 *      a   b   c = a + b
 * */

public class FibonacciMemoization {
    static int[] memo = new int[100];

    public static int fib(int n){

        // when n is zero or negative
        if(n < 1){
            return 0;
        }

        // check for stored value
        if (memo[n] != 0){
            return memo[n];
        }

        //base case
        if(n == 1 || n == 2){
            memo[n] = 1;
        }
        else {
            //recursive steps
            memo[n] = fib(n - 1) + fib(n - 2);
        }

        return memo[n];
    }

    public static void main(String[] args) {

        System.out.println(fib(20));
    }
}
