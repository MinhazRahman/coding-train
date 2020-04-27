package arrays;

/* Assumptions
* 1. How big is the array?
* 2. Can the array be null?
* 3. Can the array be empty?
* 4. What is the type of the array?
* 5.
*
* */

import java.util.Arrays;

public class ReverseArray {

    //define a method that reverses an array
    public static int[] reverse(int[] myArray){
        //check if the array is null
        if(myArray == null){
            return null;
        }
        //check if the array is empty
        if(myArray.length == 0){
            return  myArray;
        }
        //points to the first element
        int i = 0;
        //points to the last element
        int j = myArray.length - 1;
        //temporary placeholder
        int temp;

        //loop through the array till i < j and swap elements
        while (i < j){
            //swap elements
            temp = myArray[i];
            myArray[i] = myArray[j];
            myArray[j] = temp;

            //increment left pointer
            i++;
            //decrement right pointer
            j--;
        }

        return  myArray;

    }
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(reverse(numbers)));
    }
}
