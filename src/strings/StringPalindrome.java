package strings;
/* Assumptions:
* 1. Is the string case sensitive?
* 2. Is is it a word or a sentence?
* 3. Does it contain leading and trailing spaces?
* 4. Does it contain punctuation marks?
* 5. Is the string empty or null?
*
* */
public class StringPalindrome {

    public static boolean isPalindrome(String string){
        //check if the string is null or empty
        if(string == null || string.length() == 0){
            return true;
        }
        //declare a string to hold the reverse string
        String reversed = "";

        //loop through the string in reverse order and
        //copy the characters one by one into the reversed string
        for(int i = string.length() - 1; i >= 0; i--){
            reversed += string.charAt(i);
        }
        //compare the strings
        return string.equals(reversed);
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
