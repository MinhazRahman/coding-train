package miscellaneous;

/**
 * Write a method that returns the sum of two integers.
 * If both integers are equal then return the result as double,
 * otherwise return the result as integer.
 * */

public class TernaryOperator {

    public static Number sum(int a, int b){
        if(a == b){
            return (double)(a + b);
        }

        return a + b;
    }

    //The ternary is not exactly the same as its if "equivalent".
    //The ternary operator requires both result values be the same type,
    //so the int undergoes an automatic (safe) widening cast to double.
    public static Number add(int a, int b){

        return a == b ? (double)(a + b): (Number)(int)(a + b);
    }

    public static void main(String[] args) {

        //call the sum method
        System.out.println(sum(1, 2));
        System.out.println(sum(2, 2));

        //call the add method
        System.out.println(add(1, 3));
        System.out.println(add(3, 3));
    }
}
