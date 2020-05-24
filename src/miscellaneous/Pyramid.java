package miscellaneous;

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

public class Pyramid {

    // build pyramid using the brute force method
    public static void buildPyramid(int n){
        for(int i = 0; i < n; i++){
            String str = "";
            for(int j = i; j < n - 1; j++){
                str += "-";
            }

            for(int m = 0; m < 2*i + 1; m++){
                str += "*";
            }

            for(int k = i; k < n - 1; k++){
                str += "-";
            }
            System.out.println(str);
        }

    }

    public static void main(String[] args) {

        buildPyramid(5);
    }
}
