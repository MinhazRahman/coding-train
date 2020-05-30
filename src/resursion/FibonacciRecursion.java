package resursion;

/** return the nth number in the fibonacci series, using recursion
 *  a   b   c = a + b
 *  1,  1,  2,  3,  5,  8, 13, 21, 34, 55....
 *      a   b   c = a + b
 * */

public class FibonacciRecursion {

    public static int fib(int n){

        // when n is zero or negative
        if(n < 1){
            return 0;
        }

        //base case
        if(n == 1 || n == 2){
            return 1;
        }

        //recursive steps
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        System.out.println(fib(-7));
    }
}
