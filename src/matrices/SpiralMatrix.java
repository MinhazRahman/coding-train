package matrices;

import java.util.Arrays;

/** Spiral matrix algorithm:
 * 1. First, four variables containing the indices for the corner points of the array are initialized.
 *
 * 2. The algorithm starts from the top left corner of the array, and traverses the first row from left to right.
 *    Once it traverses the whole row it does not need to revisit it, thus, it increments the top right corner index.
 *
 * 3. Once complete, it traverses the rightmost column top to bottom. Again, once this completes,
 *    there is no need to revisit the rightmost column, thus, it decrements the bottom right corner index.
 *
 * 4. Next, the algorithm traverses the bottommost row and decrements the bottom left corner index afterward.
 *
 * 5. Lastly, the algorithm traverses the leftmost column, incrementing the top left corner index once it’s done.
 *
 * 6. This continues while the top left index <= the bottom right index, and the top right index <= the bottom left index.
 *
 * given a number N, return a N X N matrix
 * matrix(1) = [[1]]
 *
 * matrix(2) =
 *  [1, 2]
 *  [4, 3]
 *
 * matrix(3) =
 * [1, 2, 3]
 * [8, 9, 4]
 * [7, 6, 5]
 *
 * matrix(4) =
 * [1, 2, 3, 4]
 * [12, 13, 14, 5]
 * [11, 16, 15, 6]
 * [10, 9, 8, 7]
 * */

public class SpiralMatrix {

    public static int[][] buildMatrix(int N){
        int topLeft = 0, topRight = 0, bottomRight = N - 1, bottomLeft = N - 1;
        int n = 1;
        int[][] matrix = new int[N][N];

        while (topLeft <= bottomRight && topRight <= bottomLeft){

            // visit the top row from left to right, once visited we don't need to
            // revisit it. when done, increment top
            for(int i = topRight; i <= bottomRight; i++){
                matrix[topLeft][i] = n++;
            }
            //increment top
            topRight++;

            // visit the right most column, once visited we don't need to revisit it
            // When done, decrement right
            for(int i = topRight; i <= bottomRight; i++){
                matrix[i][bottomRight] = n++;
            }
            //decrement right
            bottomRight--;

            // visit the bottom row, once visited we don't need to revisit it
            // when done, decrement bottom
            for(int i = bottomRight; i >= topLeft; i--){
                matrix[bottomLeft][i] = n++;
            }
            // decrement bottom
            bottomLeft--;

            // visit the left most column once visited we don't need to revisit it
            // when done, increment left
            for(int i = bottomLeft; i > topLeft; i--){
                matrix[i][topLeft] = n++;
            }
            //increment left
            topLeft++;
        }

        return matrix;
    }

    public static void main(String[] args) {

        int[][] matrix = buildMatrix(3);

        for (int[] a: matrix){
            System.out.println(Arrays.toString(a));
        }
    }
}
