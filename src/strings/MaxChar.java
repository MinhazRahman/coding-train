package strings;
/*
* Given a string, return the character that is most occurred in the string:
* Example:
* findMaxChar("aabbcccccd") == "c"
* findMaxChar("apple 123111") == "1"
*
* Assumptions:
* 1. if each character is represented by 7 bits then ascii code is from 0-127(128 characters)
* 2. if each character is represented by 8 bits then ascii code is from 0-255(256 characters)
* 3. maximum length of the string
* 4. 128 unique characters or 256 unique characters
*
* */

public class MaxChar {

    public static char findMaxChar(String string){

        if(string == null || string.equals("")){
            return 0;//The 0 in ASCII-Code is null.
        }

        //create an array counts of length 128 and initialize to zeros
        //counts array will hold number of times a character has occurred in the string
        int[] counts = new int[128]; //takes 128x4 bytes = 512 bytes memory

        //iterate over the string and increment the number of occurrences
        for(int i = 0; i < string.length(); i++){
            //get the ascii value of each character
            int ascii = string.charAt(i);
            //we wil use the ascii value as index and
            //increment the value at index position ascii
            counts[ascii]++;
        }

        //find the character that occurs most
        //let the character at index 0 occurs most
        int max = counts[0];
        int asciiValue = 0;//The 0 in ASCII-Code is null.
        for(int j = 1; j < counts.length; j++){
            if(counts[j] > max){
                max = counts[j];
                asciiValue = j;
            }
        }

        return (char) asciiValue;
    }


    public static void main(String[] args) {

        System.out.println(findMaxChar("abccccd"));
        System.out.println(findMaxChar("apple 1231114"));
        System.out.println(findMaxChar("apple !!!!!#$*&"));
        System.out.println(findMaxChar(""));
        System.out.println(findMaxChar(null));
    }
}
