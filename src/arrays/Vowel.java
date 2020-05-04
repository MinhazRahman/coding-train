package arrays;

public class Vowel {

    public static int countVowels(String string){
        String vowels = "aeiou";
        //convert the string into character array
        char[] chars = string.trim().toLowerCase().toCharArray();
        int count = 0;

        //iterate over the string and check if each character is a vowel
        //if yes then add to count and repeat
        for(char ch: chars){
            if(vowels.contains(Character.toString(ch))){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {

        System.out.println(countVowels("why?"));
        System.out.println(countVowels("why do you ask me?"));
        System.out.println(countVowels("This is a string!"));
        System.out.println(countVowels("A man in the jungle"));
    }
}
