package resursion;

/**
 * Print numbers from n to 0 using recursion
 * */

public class PrintNumber {

    public static void printNumber(int n){

        // base case
        if(n == 0){
            return;
        }

        // recursive step, head recursion
        System.out.println(n);
        printNumber(n - 1);

    }

    public static void main(String[] args) {

        printNumber(10);
    }
}
