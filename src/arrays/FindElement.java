package arrays;

import java.util.Arrays;

/*
* Find an element in an array of objects
* 1. using for loop
* 2. using list
* 3. using stream api
* 4. using Arrays.binarySearch() method
*
* You can’t use the popular Arrays.asList to convert primitive array directly,
* because boxing issue
* int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
* No, the return type is not what we want
* List<int[]> ints = Arrays.asList(number);
* */

public class FindElement {

    //converts the array into list and check if the element is present
    //if the element is present returns false otherwise returns true
    public static boolean includes(String[] arr, String element) {
        return Arrays.asList(arr).contains(element);
    }

    public static void main(String[] args) {
        String[] names = {"Jhon", "Michael", "Doe", "Mark"};

        System.out.println(includes(names, "Mike"));
        System.out.println(includes(names, "Doe"));
        System.out.println(includes(names, "Michael"));
        System.out.println(includes(names, "null"));
    }
}
