package arrays;

public class Program15 {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int count = 10;
        System.out.print(first+" "+second);
        for (int i=2; i<count; i++){
            int temp = first + second;
            System.out.print(" "+temp);
            first = second;
            second = temp;
        }
    }
}
