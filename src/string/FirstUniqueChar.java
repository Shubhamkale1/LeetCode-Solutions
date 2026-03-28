package string;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        int n = s.length();
        for (int i=0; i<s.length(); i++){
            boolean unique = true;
            for (int j=0; j<s.length(); j++){
                if (i != j && s.charAt(i) == s.charAt(j)){
                    unique = false;
                    break;
                }
            }
            if (unique){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueChar sol = new FirstUniqueChar();
        String s = "leetcode";
        int result = sol.firstUniqChar(s);
        System.out.println(result);
    }
}
