//import com.apple.laf.resources.aqua;

public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String lowercaseString = "";
        char letterLower;

        for (int i = 0 ; i < str.length(); i++){
            int letter_ascii = str.charAt(i);
            if (65 <= letter_ascii && letter_ascii <= 90){
                int lowerletter_ascii = letter_ascii + 32;
                letterLower = (char)lowerletter_ascii;
            }else{
                letterLower = str.charAt(i);
            }

            lowercaseString += letterLower;
        }
        return lowercaseString;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        
        String str1Lower = lowerCase(str1);
        String str2Lower = lowerCase(str2);

        if (str1Lower == ""){
            return false;
        }else if (str2Lower == ""){
            return true;
        }

        char charToCheck = str2Lower.charAt(0);

        for (int j = 0; j < str1Lower.length()-1; j++){
            if (charToCheck == str1Lower.charAt(j)) {
                for (int i = 0; i < str2Lower.length(); i++ ){
                    if (str2Lower.charAt(i) != str1Lower.charAt(j)) {
                        return false;
                    }
                    j++;
                }
                return true;
            }
        }
        return false;
    }
}













