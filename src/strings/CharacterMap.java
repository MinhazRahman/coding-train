package strings;
/*
* Find out how many times each character occurs in a string
* */

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterMap {

    //returns the character map
    public static Map<Character, Integer> characterMap(String string){
        char maxChar = 0;
        int max = 0;
        //map stores character value map
        Map<Character, Integer> map = new LinkedHashMap<>();

        //if the string is null or empty
        if(string == null || string.equals("")){
            return null;
        }

        //convert the string into character array
        char[] chars = string.toCharArray();

        //store each character and number of occurrences of each character into the map
        for (Character ch: chars){
            if(map.containsKey(ch)){
                //get the value
                Integer count = map.get(ch);
                map.replace(ch, count, count + 1);
            }
            else {
                map.put(ch, 1);
            }
        }

        //find the character that occurs maximum number of times
        for (Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                maxChar = entry.getKey();
            }
        }

       // System.out.println(maxChar);

        return map;

    }

    public static void main(String[] args) {
        System.out.println(characterMap("apple 2311115"));
    }
}
