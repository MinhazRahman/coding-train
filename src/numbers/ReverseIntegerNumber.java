package numbers;
/*Given an integer, return an integer that is the reverse
 * ordering of numbers.
 * reverseInt(15) == 52
 * reverseInt(981) == 189
 * reverseInt(500) == 5
 * reverseInt(-15) == -51
 * reverseInt(-90) == -90
 *
 * */
public class ReverseIntegerNumber {

    //function that reverses a given number
    public static int reverseInt(int number){
        //divisor
        int d = 10;
        //remainder
        int r = 0;
        int reversed = 0;
        boolean isNegative = false;

        if(number < 0){
            number = number * -1;
            isNegative = true;
        }

        //divide the number till the quotient is zero
        while (number != 0){
            r = number % d;
            reversed = reversed*10 + r; //add the remainder(last digit) one by one
            number = number / d; //remove the last digit from the number
        }

        if(isNegative){
            return -reversed;
        }else {
            return reversed;
        }
    }

    public static void main(String[] args) {

        System.out.println(reverseInt(981));
        System.out.println(reverseInt(500));
        System.out.println(reverseInt(-15));
        System.out.println(reverseInt(10));
        System.out.println(reverseInt(100));
        System.out.println(reverseInt(-123));
    }
}
