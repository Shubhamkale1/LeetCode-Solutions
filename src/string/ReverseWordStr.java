package string;

import arrays.CreateTargetArray;

public class ReverseWordStr {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWord(s));
    }
    static String reverseWord(String s){
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]).append(" ");
        }
        return ans.toString().trim();
    }
}
