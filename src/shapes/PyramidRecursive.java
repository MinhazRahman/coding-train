package shapes;

/**
 * Build the pyramid using recursive method
 * */
public class PyramidRecursive {
    public static void buildPyramid(int n, int row, String steps){
        //calculate the middle column
        int mid = (2*n - 1)/2;

        //base cases
        if(row == n){
            return;
        }

        if(steps.length() == 2*n - 1){
            System.out.println(steps);
            buildPyramid(n, row + 1, "");
            return;
        }

        // build the steps
        if(mid - row <= steps.length() && mid + row >= steps.length()){
            steps += "*";
        }
        else {
            steps += "-";
        }

        //recursive step
        buildPyramid(n, row, steps);
    }
    public static void main(String[] args) {

        buildPyramid(5, 0, "");
    }
}
