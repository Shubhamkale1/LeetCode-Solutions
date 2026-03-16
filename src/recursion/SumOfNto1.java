package recursion;

public class SumOfNto1 {
    public static void main(String[] args) {
        int n = 5;
        int ans = facf(5);
        System.out.println(ans);
    }

       static int facf(int n) {
        if (n <= 1){
            return 1;
        }
        return  n + facf(n-1);
    }
}
