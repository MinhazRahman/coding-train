package strings;

import java.util.Arrays;

/* Assumptions:
 * 1. What is the maximum length of the string?
 * 2. Can the string be empty?
 * 3. Can it be null?
 * 4. Will it contain leading and trailing spaces?
 * 5. Can I declare a helper string as placeholder?
 * 6. Do I have to perform in place reversal?
 * 7. Can I declare a StringBuilder variable as placeholder?
 * */
public class ReverseStringInPlace {

    //reverse a string in place, without using another string
    public static String reverse(String myString){

        //if the string is empty or null then return the string itself
        if(myString == null || myString.equals("")){
            return myString;
        }

        //convert the string into char arrays
        char[] chars = myString.toCharArray();

        //declare a string builder variable as placeholder
        StringBuilder stringBuilder = new StringBuilder();

        //points to the first character
        int i = 0;
        //points to the last character
        int j = myString.length() - 1;
        //temp variable holds data
        char temp;

        //loop through the string till i < j and swap the characters
        while (i < j){
            //swap characters
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            //increment left pointer
            i++;
            //decrement right pointer
            j--;

        }

        //convert the array into a string using string builder
        for (char aChar : chars) {
            stringBuilder.append(aChar);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        System.out.println(reverse("programming"));
    }
}
