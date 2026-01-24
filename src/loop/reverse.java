package loop;

public class reverse {
    public static void main(String[] args) {
        int num = 1234555;
        int ans = 0;
        while (num > 0){
            int rem = num % 10;
//            if (ans > Integer.MAX_VALUE/10 || ans < Integer.MIN_VALUE/10){
//                return;
//            }
            num = num / 10;
            ans = ans * 10 + rem;
        }
        System.out.print(ans);
    }
}
