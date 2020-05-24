package miscellaneous;

public class PrintingStairsRecursion {

    public static void printStairs(int n, int row, String stairs){
        // base case
        if(row == n){
            return;
        }

        if(stairs.length() == n){
            System.out.println(stairs);
            printStairs(n, row + 1, "");
            return;
        }

        if(stairs.length() <= row){
            stairs += "*";
        }
        else {
            stairs += "-";
        }

        // recursive step, tail recursion
        printStairs(n, row, stairs);
    }
    public static void main(String[] args) {

        printStairs(5, 0, "");
    }
}
