package shapes;

/**build a pyramid like structure
 * n = 2, row = n, col = 2n - 1
 *   0 1 2
 * 0 - * -
 * 1 * * *
 *
 * n = 3, row = n, col = 2n - 1
 *   0 1 2 3 4
 * 0 - - * - -
 * 1 - * * * -
 * 2 * * * * *
 * */

public class BuildPyramid {

    // build pyramid using the brute force method
    public static void buildPyramid(int n){
        int mid = (2*n - 1)/2;

        for(int row = 0; row < n; row++) {
            String str = "";
            for (int col = 0; col < 2*n - 1; col++) {
                if(mid - row <= col && mid + row >= col){
                    str +="*";
                }
                else {
                    str +="-";
                }
            }

            System.out.println(str);
        }
    }

    public static void main(String[] args) {

        buildPyramid(5);
    }
}
