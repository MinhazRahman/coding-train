package strings;

public class SentenceCapitalization {

    public static String capitalize(String string){
        //if the string is null or empty
        if(string == null || string.isEmpty()) {
            return string;
        }
        //split the string
        String[] words = string.trim().split(" ");
        String str = "";
        //capitalize each words
        for(String word: words){
            str += word.substring(0, 1).toUpperCase() + word.substring(1) + " " ;
        }

        return str;
    }

    public static void main(String[] args) {

        System.out.println(capitalize("hello world"));
        System.out.println(capitalize("this a string"));
        System.out.println(capitalize("Look! it's working"));
    }
}
