package arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Count vowels using regular expression
* */

public class FindingVowels {

    public static int countVowels(String string) {
        int count = 0;

        if (string == null || string.isEmpty()) {
            return count;
        }
        // Create a pattern that detects vowels.
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = pattern.matcher(string);
        // Look for the next match and if found, add to count and repeat.
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static int countVowelsRegex(String str) {
        int count = 0;
        if (str.length() > 0) {

            // Create a pattern that detects vowels.
            Pattern vowelPattern = Pattern.compile("[aeiou]");
            Matcher vowelMatcher = vowelPattern.matcher(str);
            // Look for the next match and if found, add to count and repeat.
            while (vowelMatcher.find()) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(countVowels("why?"));
        System.out.println(countVowels("How many vowels are there?"));
        System.out.println(countVowels("This is a string"));

        System.out.println(countVowelsRegex("Finding vowels"));

    }
}
