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

    public static boolean isAnagram(String stringA, String stringB){
        // if string is null
        if(stringA == null || stringB == null){
            return false;
        }

        // if string is empty
        if (stringA.isEmpty() || stringB.isEmpty()){
            return false;
        }

        // it lengths are not same
        if(stringA.length() != stringB.length()){
            return false;
        }

        // get the character map for each string
        Map<Character, Integer> mapA = getCharacterMap(stringA);
        Map<Character, Integer> mapB = getCharacterMap(stringB);

        // if mapA is equal to mapB then return true, otherwise return false
        return mapA.equals(mapB);
    }

    // character map defines how many times each character occurs in the string
    public static Map<Character, Integer> getCharacterMap(String string){

        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();

        // remove special characters and spaces from the input string
        // and convert the string to char array
        // consider each character of the string as a key and
        // number of times each character occurs in a string as a value
        for(Character ch: string.replaceAll("[^a-zA-Z0-9]", "").toCharArray()){

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
        System.out.println(isAnagram("sleep and sound", "sound and safe"));
    }
}
