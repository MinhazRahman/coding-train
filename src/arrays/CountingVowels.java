package arrays;
/*
* Count the number of vowels in a string
* */
public class CountingVowels {

    public static int findVowels(String string){
        String vowels = "aeiouAEIOU";
        int count = 0;

        //iterate over the string and check if each character is a vowel
        //if yes then add to count and repeat
        for(int i = 0; i < string.length(); i++){
            if(vowels.indexOf(string.charAt(i)) != -1){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {

        System.out.println(findVowels("why?"));
        System.out.println(findVowels("This is a string!"));
        System.out.println(findVowels("A man in the jungle"));
    }
}
