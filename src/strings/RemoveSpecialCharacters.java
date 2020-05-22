package strings;

/**
 * Remove special characters from a string using regular expression:
 * 1. remove special characters and digits, keep the spaces (alpha only)
 * 2. remove only special characters, keep digits and spaces (alphanumeric)
 * 3. remove special characters and spaces, keep digits (alpha only)
 * */

public class RemoveSpecialCharacters {

    // remove special characters and digits, keep the spaces (alpha only)
    public static String removeSpecialCharacter(String inputString){
        String pattern = "[^a-z A-Z]";
        String alphaOnly = inputString.replaceAll(pattern, "");

        return alphaOnly;
    }

    // remove only special characters, keep digits and spaces (alphanumeric)
    public static String removeSpecialChars(String inputString){
        String pattern = "[^a-zA-Z 0-9]";
        String alphanumeric = inputString.replaceAll(pattern, "");

        return alphanumeric;
    }

    // remove special characters and spaces, keep digits (alpha only)
    public static String removeSpecialChar(String inputString){
        String pattern = "[^a-zA-Z]";
        String alphaOnly = inputString.replaceAll(pattern, "");

        return alphaOnly;
    }

    public static void main(String[] args) {

        System.out.println(removeSpecialCharacter("This $$$is a*** ###String"));
        System.out.println(removeSpecialChars("My@@ house is ##10miles away***"));
        System.out.println(removeSpecialChar("No@@@ ## &&&Spaces %%In This String."));

    }
}
