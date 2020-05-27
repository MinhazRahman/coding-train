package numbers;

/** return the nth number in the fibonacci series
 *  a   b   c = a + b
 *  1,  1,  2,  3,  5,  8, 13, 21, 34, 55....
 *      a   b   c = a + b
 * */

public class Fibonacci {

    public static int fib(int n){
        int a = 1 , b = 1;
        int c = 0;

        // for the first two numbers in the series
        if(n == 1 || n == 2){
            return 1;
        }

        // calculate the nth number in the series
        for(int i = 2; i < n; i++ ){
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
