package strings;

import java.util.Arrays;

/**
 * Check whether two strings are anagram of each other
 * Assumptions:
 * 1. Can the strings be null?
 * 2. Can the strings be empty
 * 3. Can the strings be of different length?
 * 4. Do I need to put checks?
 * */

public class StringAnagram {

    public static boolean isAnagram(String stringA, String stringB){
        // if string is null
        if(stringA == null || stringB == null){
            return false;
        }

        // if string is empty
        if (stringA.isEmpty() || stringB.isEmpty()){
            return false;
        }

        // if strings are equal then return true, otherwise return false
        return cleanString(stringA).equals(cleanString(stringB));
    }

    public static String cleanString(String string){

        // remove special characters from the string
        String str = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // convert the string into String array
        String[] strings = str.split("");
        // sort the array
        Arrays.sort(strings);

        // join the strings
        String joinedString = String.join("",strings);

        return joinedString;
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("safe and sound", "Sound and safe!!!"));
        System.out.println(isAnagram("sleep and sound", "sound and safe"));

    }
}
