package strings;
/*Given a string, return true if the string is a palindrome
* or false if it is not. Palindromes are strings that form the
* same strings if reversed.
*
* Considering the String class' length method returns an int,
* the maximum length that would be returned by the method would be
* Integer.MAX_VALUE, which is 2^31 - 1 (or approximately 2 billion.)
*
* Assumptions:
* 1. Is the string case sensitive?
* 2. Is is it a word or a sentence?
* 3. Does it contain leading and trailing spaces?
* 4. Does it contain punctuation marks?
* 5. Is the string empty or null?
*
* */

public class Palindrome {

    public static boolean isPalindrome(String string){
        //check if the string is null or empty
        if(string == null || string.length() == 0){
            return true;
        }
        //points to the first character
        int i = 0;
        //points to the last character
        int j = string.length() - 1;
        //temp variable holds data

        //loop through the string from both ends till i < j
        //and compare characters
        while (i < j) {
            //if there is any mismatch
            if(string.charAt(i) != string.charAt(j) ){
                return false;
            }

            //increment the left pointer
            i++;
            //decrement the right pointer
            j--;
        }

        //if there is no mismatch
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(null));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("malayalam"));
        System.out.println(isPalindrome("toyota"));
        System.out.println(isPalindrome("notpalindrome!"));
    }
}
