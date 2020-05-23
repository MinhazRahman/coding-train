package miscellaneous;

/** Printing steps: For input number 3, the program will print the following output
 * *##
 * **#
 * ***
 * */

public class PrintingStairs {

    public static void printStairs(int n){

        for(int row = 0; row < n; row++){
            String stair = "";

            for(int col = 0; col < n; col++){
                if(row >= col){
                    stair += "*";
                }
                else {
                    stair += "-";
                }
            }

            System.out.println(stair);
        }
    }

    public static void main(String[] args) {

        printStairs(5);
    }
}
