package strings;

import java.util.LinkedHashMap;
import java.util.Map;

/*
* Given a string, return the character that is most occurred in the string:
* Example:
* findMaxChar("aabbcccccd") == "c"
* findMaxChar("apple 123111") == "1"
*/
public class MaxCharacter {

    //find the max character in a string using java HashMap
    public static char maxCharacter(String string){

        char maxChar = 0;
        int max = 0;

        //if the string is null or empty
        if(string == null || string.equals("")){
            return 0;//The 0 in ASCII-Code is null.
        }

        //convert the string into char array
        char[] chars = string.toCharArray();

        //use map to store key value pairs
        Map<Character, Integer> map = new LinkedHashMap<>();

        //build the map: key value pairs
        //each character is a key and how many times it occurs in the string is the value
        for(Character ch: chars){
            //if the character is already in the map
            if(map.containsKey(ch)){
                //get the old value
                Integer n = map.get(ch);
                //replace the old value associated with the key with the new value
                map.replace(ch, n,n + 1);
            }
            else {
                //store the character in the map
                map.put(ch, 1);
            }
        }

        //print the map
        System.out.println(map);

        //find the character that occurs most in the string
        for (Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        //return the character
        return maxChar;
    }

    public static void main(String[] args) {
        System.out.println(maxCharacter("abbbcccca"));

        System.out.println(maxCharacter("apple 123111"));
    }
}
