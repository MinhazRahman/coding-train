package miscellaneous;

/** Printing steps: For input number 3, the program will print the following output
 * *##
 * **#
 * ***
 * */

public class PrintingSteps {

    public static void printSteps(int stepNumber){
        for(int step = 0; step < stepNumber; step++){
            System.out.print("'");
            for(int i = 0; i <= step; i++){
                System.out.print("*");
            }
            for(int j = step; j < stepNumber - 1; j++){
                System.out.print("#");
            }
            System.out.println("'");
        }
    }

    public static void main(String[] args) {

        printSteps(5);
    }
}
