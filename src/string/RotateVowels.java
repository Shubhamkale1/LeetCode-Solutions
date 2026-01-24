package string;

public class RotateVowels {
    static String reverseVowels(String s){
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            if (!isVowel(arr[start])){
                start++;
            } else if (!isVowel(arr[end])) {
                end--;

            }else {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }
        return new String(arr);
    }
    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }

}
