package numbers;

/* FizzBuzz program
* if a number is multiple of 3 then print 'Fizz'
* if a number is multiple of 5 then print 'Buzz'
* if a number is multiple of both 3 and 5 then print 'FizzBuzz'
* */

public class FizzBuzz {

    public static void fizzBuzz(int maxNum){

        for(int n = 1; n <= maxNum; n++){

            if(n % 3 == 0 && n % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(n % 3 == 0){
                System.out.println("Fizz");
            }
            else  if(n % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args) {

        fizzBuzz(30);
    }
}
