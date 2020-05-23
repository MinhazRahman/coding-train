package resursion;

/**
 * Print numbers from 0 to n using recursion
 * */

public class PrintNaturalNumber {

    public static void printNumber(int n){

        // base case
        if(n == 0){
            return;
        }

        // recursive step, tail recursion
        printNumber(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {

        printNumber(10);
    }
}
