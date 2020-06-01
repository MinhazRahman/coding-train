package arrays;

import java.util.Arrays;

/**
--- Directions
Given an array and chunk size, divide the array into many sub arrays
where each sub array is of length size
--- Examples
chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]
chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]
chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]
chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]
* */

public class ArrayChunk {

    // cal row size of two dimensional array
    public static int rowSize(int arrayLength, int chunkSize){
        // calculate row size
        int size = 0;
        if(arrayLength % chunkSize == 0){
            size = arrayLength/chunkSize;
        }
        else {
            size = arrayLength/chunkSize + 1;
        }

        return size;
    }

    public static int[][] chunkArray(int[] a, int chunkSize){

        // chunked array, array of arrays
        int[][] chunkedArray = new int[rowSize(a.length, chunkSize)][];

        int index = 0;
        int fromIndex = 0;
        int toIndex = 0;

        while (fromIndex < a.length){
            // if "fromIndex + chunkSize" is greater than a.length then toIndex = a.length
            // otherwise toIndex = fromIndex + chunkSize
            toIndex = Math.min(fromIndex + chunkSize, a.length);

            chunkedArray[index] = Arrays.copyOfRange(a, fromIndex, toIndex);

            // calculate fromIndex
            fromIndex += chunkSize;
            index++;
        }

        return chunkedArray;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(Arrays.deepToString(chunkArray(arr, 2)));
        System.out.println(Arrays.deepToString(chunkArray(arr, 3)));
        System.out.println(Arrays.deepToString(chunkArray(arr, 4)));
        System.out.println(Arrays.deepToString(chunkArray(arr, 10)));
    }


}
