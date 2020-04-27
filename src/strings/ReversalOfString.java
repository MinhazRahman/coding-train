package strings;

/* Assumptions:
 * 1. What is the maximum length of the string?
 * 2. Can the string be empty?
 * 3. Can it be null?
 * 4. Will it contain leading and trailing spaces?
 * 5. Can I declare a helper string?
 * 6. Do I have to perform in place reversal?
 * 7. Can I use any built in method?
 * */

public class ReversalOfString {

    public static String reverse(String myString){
        //if the string is empty or null then return the string itself
        if(myString == null || myString.equals("")){
            return myString;
        }

        //points to the last character
        int j = myString.length() - 1;

        //declare an empty helper string
        String reversed = "";

        //loop through the string
        //and copy the characters one by one into another string
        for(int i = 0; i <= j; i++){
            reversed = myString.charAt(i) + reversed;
        }

        return reversed;
    }

    public static void main(String[] args) {

        System.out.println(reverse("Programming"));
        System.out.println(reverse(null));
        System.out.println(reverse(""));
    }
}
