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

public class ReverseInteger {

    public static Integer reverseInt(int number){
        //divisor
        int d = 10;
        //remainder
        int r = 0;
        //string to hold the reversed integer
        String reversed = "";

        //if the number is negative
        if(number < 0){
            //take the absolute value of number
            number = Math.abs(number);
            reversed = "-";
        }

        //divide the number till the quotient is zero
        while (number != 0){
            r = number % d;
            //take the quotient
            number = number / d;
            //copy the remainder to the reversed string
            reversed += r;
        }

        return Integer.parseInt(reversed);
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
