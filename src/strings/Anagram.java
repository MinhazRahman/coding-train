package strings;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * character map for string "hello" is:
 * {
 *    h: 1,
 *    e: 1,
 *    l: 2,
 *    o: 1
 * }
 *
 * Check whether two strings are anagram of each other
 * */

public class Anagram {

    public static boolean isAnagram(String string1, String string2){
        // if string is null
        if(string1 == null || string2 == null){
            return false;
        }

        // if string is empty
        if (string1.isEmpty() || string2.isEmpty()){
            return false;
        }

        // it lengths are not same
        if(string1.length() != string2.length()){
            return false;
        }

        // remove special characters and spaces from both strings
        String pattern = "[^a-zA-Z0-9]";
        String str1 = string1.replaceAll(pattern, "");
        String str2 = string2.replaceAll(pattern, "");

        // create two arrays of length 128
        Map<Character, Integer> map1 = new LinkedHashMap<>();
        Map<Character, Integer> map2 = new LinkedHashMap<>();

        // get the character map for each string
        map1 = getCharacterMap(str1);
        map2 = getCharacterMap(str2);

        // compare if both maps are equal, then strings are anagrams
        if(map1.equals(map2)){
            return true;
        }

        // not anagrams
        return false;
    }

    // character map defines how many times each character occurs in the string
    public static Map<Character, Integer> getCharacterMap(String string){

        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();

        // iterate through string and consider each character as a key and
        // how many times each character occurs in a string as values
        for(Character ch: string.toCharArray()){

            // if the character is already in the map
            if(characterIntegerMap.containsKey(ch)){
                //get the value
                Integer count = characterIntegerMap.get(ch);
                characterIntegerMap.replace(ch, count, count+1);
            }
            else {
                characterIntegerMap.put(ch, 1);
            }
        }

        return characterIntegerMap;
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("safe and sound", "sound and safe"));
    }
}
