package numbers;

import java.util.Arrays;

/** return the the fibonacci series up to nth number, where series starts with 0
 *  a   b   c = a + b
 *  0,  1,  1,  2,  3,  5,  8, 13, 21, 34, 55....
 *      a   b   c = a + b
 * */

public class FibonacciSeries {

    // n is the length of the series
    public static int[] fibSeries(int n){
        int[] fib = new int[n];
        int a = 0, b = 1, c = 0;

        if(n == 0 || n == 1){
            return fib;
        }

        // add the first two slots
        fib[0] = a;
        fib[1] = b;

        for(int i = 2; i < n; i++){
            c = a + b;
            a = b;
            b = c;

            fib[i] = c;
        }

        return fib;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(fibSeries(3)));
    }
}
