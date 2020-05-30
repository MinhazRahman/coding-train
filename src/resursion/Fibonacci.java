package resursion;

/** return the nth number in the fibonacci series, using recursion
 *  a   b   c = a + b
 *  1,  1,  2,  3,  5,  8, 13, 21, 34, 55....
 *      a   b   c = a + b
 * */

public class Fibonacci {

    public static int fib(int n){

        //base case
        if(n < 2){
            return n;
        }

        //recursive steps
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        System.out.println(fib(8));
    }
}
