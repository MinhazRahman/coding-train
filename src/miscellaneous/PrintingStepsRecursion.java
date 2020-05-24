package miscellaneous;

public class PrintingStepsRecursion {
    public static void printSteps(int n, int row){

        // base case
        if(row == n){
            return;
        }

        // recursive step, tail recursion
        System.out.println(addSteps(n, row, 0, "" ));
        printSteps(n, row + 1);
    }

    public static String addSteps(int n, int row, int col, String stairs){
        // base case
        if(col == n){
            return stairs;
        }
        // recursive steps
        if(row >= col){
            stairs += "*";
        }
        else {
            stairs += "-";
        }
        return addSteps(n, row, col + 1, stairs);
    }
    public static void main(String[] args) {

        printSteps(5, 0);
    }
}
