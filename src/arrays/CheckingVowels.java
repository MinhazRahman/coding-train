package arrays;
/*
 * Count the number of vowels in a string
 * */
public class CheckingVowels {

    public static int countVowels(String string){
        String vowels = "aeiouAEIOU";
        int count = 0;

        //iterate over the string and check if each character is a vowel
        //if yes then add to count and repeat
        for(int i = 0; i < string.length(); i++){
            if(vowels.contains(Character.toString(string.charAt(i)))){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {

        System.out.println(countVowels("why?"));
        System.out.println(countVowels("This is a string!"));
        System.out.println(countVowels("A man in the jungle"));
    }
}
