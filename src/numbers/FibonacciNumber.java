package numbers;

/** return the nth number in the fibonacci series, where series starts with 0
 *  a   b   c = a + b
 *  0,  1,  1,  2,  3,  5,  8, 13, 21, 34, 55....
 *      a   b   c = a + b
 * */

public class FibonacciNumber {

    public static int fib(int n){
        int a = 0 , b = 1;
        int c = 0;

        // for the first two numbers in the series
        if(n == 0 || n == 1){
            return n;
        }

        // calculate the nth number in the series
        for(int i = 2; i <= n; i++ ){
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    public static void main(String[] args) {

        System.out.println(fib(6));
    }
}
