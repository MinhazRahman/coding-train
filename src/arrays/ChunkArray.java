package arrays;

import java.util.LinkedList;
import java.util.List;

/*
--- Directions
Given an array and chunk size, divide the array into many subarrays
where each subarray is of length size
--- Examples
chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]
chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]
chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]
chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]
* */

public class ChunkArray {

    public static List<List<Integer>> chunk(List<Integer> list, int size) { // 1.250ms
        List<List<Integer>> chunked = new LinkedList<>();
        int index = 0;

        while (index < list.size()) {
            chunked.add(list.subList(index, Math.min(index + size, list.size())));
            index += size;
        }
        System.out.println(chunked);
        return chunked;
    }

    public static List<List<Integer>> chunkList(List<Integer> list, int chunkSize){
        //declare an array of arrays
        List<List<Integer>> chunkedList = new LinkedList<>();
        int fromIndex = 0;
        int toIndex = chunkSize;
        int size = list.size();

        while (fromIndex < size){
            chunkedList.add(list.subList(fromIndex, toIndex));
            fromIndex += chunkSize;
            // if "fromIndex + chunkSize" is greater than size then toIndex = size
            // otherwise toIndex = fromIndex + chunkSize
            toIndex = Math.min(fromIndex + chunkSize, size);
        }

        return chunkedList;
    }

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

       // chunk(list, 2);

        System.out.println(chunkList(list, 3));
    }
}
