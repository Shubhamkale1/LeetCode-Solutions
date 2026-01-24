// Count vowels and consonants in a string
package string;

public class Program1 {
    public static void main(String[] args) {
        String str = "hello";
        vowels(str);
        }

    private static void vowels(String str) {
        int vowel = 0;
        int consonunts = 0;
        String vowelChars = "";
        String consonantChars = "";
        str = str.toLowerCase();


        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z'){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowel++;
                    vowelChars += ch;
                }else {
                    consonunts++;
                    consonantChars += ch;
                }
            }
        }
        System.out.println(vowel+" "+ vowelChars+" ");
        System.out.println(consonunts+" "+ consonantChars+" ");
    }
}
