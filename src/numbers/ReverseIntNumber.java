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
public class ReverseIntNumber {

    //function that reverses a given number
    public static int reverseInt(int number){
        int lastDigit;
        int reversed = 0;
        //1 indicates positive number and -1 indicates negative number
        int sign = 1;

        //multiply a negative number by -1 to make it positive
        if(number < 0){
            sign = -1;
            number = number * sign;
        }

        //divide the number by 10 till the quotient is zero
        while (number != 0){
            //use modulus operator to get the last digit,
            //remainder will be the last digit
            lastDigit = number % 10;
            //add the last digit to reversed number
            reversed = reversed*10 + lastDigit;
            //divide the number by 10 to remove the last digit from the number
            number = number / 10;
        }

        return reversed * sign;
    }

    public static void main(String[] args) {

        System.out.println(reverseInt(981));
        System.out.println(reverseInt(500));
        System.out.println(reverseInt(-15));
        System.out.println(reverseInt(10));
        System.out.println(reverseInt(-90));
        System.out.println(reverseInt(-123));
    }
}
