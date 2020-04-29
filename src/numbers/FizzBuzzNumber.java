package numbers;
/* FizzBuzz program
 * if a number is multiple of 3 then print 'Fizz'
 * if a number is multiple of 5 then print 'Buzz'
 * if a number is multiple of both 3 and 5 then print 'FizzBuzz'
 * */
public class FizzBuzzNumber {

    public static void fizzBuzz(int maxNum){
        String message;

        for(int n = 1; n <= maxNum; n++){
            message = "";

            if(n % 3 == 0){
                message += "Fizz";
            }

            if(n % 5 == 0){
                message += "Buzz";
            }

            if(message == ""){
                System.out.println(n);
            }
            else {
                System.out.println(message);
            }
        }
    }
    public static void main(String[] args) {

        fizzBuzz(30);
    }
}
