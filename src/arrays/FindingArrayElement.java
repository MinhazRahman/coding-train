package arrays;
/*
* Finding an element in an array
* 1. using for loop
* 2. using list
* 3. using stream api
* 4. using Arrays.binarySearch() method
* */
public class FindingArrayElement {

    //define a method to find an element in an array
    public static boolean contains(int[] arr, int element){
        //iterate over the array, if found return true,if not repeat
        for (int n: arr){
            if(n == element){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(contains(numbers, 10));
        System.out.println(contains(numbers, 4));
        System.out.println(contains(numbers, 7));
        System.out.println(contains(numbers, 1));
    }
}
