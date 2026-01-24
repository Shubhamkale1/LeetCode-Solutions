//Reverse a string
package string;

public class Program3 {
    static void reverse(char[] ch){
        int start = 0;
        int end = ch.length-1;

        while (start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String str = "Shubham";
        char[] ch = str.toCharArray();
        reverse(ch);
        System.out.println(ch);

    }
}
