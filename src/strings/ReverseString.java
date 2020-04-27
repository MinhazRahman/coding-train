package strings;

/* Assumptions:
* 1. What is the maximum length of the string?
* 2. Can the string be empty?
* 3. Can it be null?
* 4. Will it contain leading and trailing spaces?
* 5. Can I declare a helper string?
* 6. Do I have to perform in place reversal?
* */

public class ReverseString {

    //takes a string as parameter, reverses the string and returns it
    public static String reverseString(String myString){

        //if the string is empty or null then return the string itself
        if(myString == null || myString.equals("")){
            return myString;
        }

        //declare an empty helper string
        String reversedString = "";

        //loop through the string in reverse order
        //and copy the characters one by one into another string
        for(int i = myString.length() - 1; i >= 0; i--){
            reversedString += myString.charAt(i);
        }

        return  reversedString;
    }

    public static void main(String[] args) {

        System.out.println(reverseString("Programming"));
        System.out.println(reverseString(null));
        System.out.println(reverseString(""));
    }
}
