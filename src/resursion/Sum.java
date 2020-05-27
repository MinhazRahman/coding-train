package resursion;

/**
 * Sum of N natural number using recursion
 * */
public class Sum {

    public static int sum(int n){

        // base case
        if(n == 0){
            return 0;
        }

        //recursive step
        return n + sum(n - 1);
    }
    public static void main(String[] args) {

        System.out.println(sum(5));
    }
}
