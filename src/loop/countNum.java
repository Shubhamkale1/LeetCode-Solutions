package loop;

public class countNum {
    public static void main(String[] args) {
        int num = 123232;
        int count = 0;
        while (num > 0){
            int rem = num % 10;
            if (rem == 2){
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
