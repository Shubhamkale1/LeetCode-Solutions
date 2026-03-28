package hashmap;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int maxl = 0;

        for (int i=0; i<s.length(); i++) {

            for (int j = i; j < s.length(); j++) {

                boolean unique = true;
                for (int k = i; k < j; k++) {
                    if (s.charAt(k) == s.charAt(j)) {
                        unique = false;
                        break;
                    }
                }
                if (!unique) {
                    break;
                }
                maxl = Math.max(maxl, j - i + 1);
            }
        }
        return maxl;

    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));

    }
}
