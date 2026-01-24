package arrays;

public class Program5 {
    public static void main(String[] args) {
        int[] number = {2, 4, 5, 6, 7, 8, 9};
        for (int num : number) {
            if (isPrime(num)) {
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " is not prime");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 1; i <= num; i++) {
            if (num % 2 == 0) return false;
        }
        return true;
    }
}
