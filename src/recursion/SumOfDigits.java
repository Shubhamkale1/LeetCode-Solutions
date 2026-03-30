package recursion;

import arrays.CreateTargetArray;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 54321;
        System.out.println(sumOfDigits(n));
    }
    static int sumOfDigits(int n){
        if (n == 0){
            return n;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

//    normal iteration method
//    static int sumOfDigits2(int n){
//        int sum = 0;
//        while (n > 0){
//            int r = n % 10;
//            sum = sum + r;
//            n = n / 10;
//        }
//        return sum;
//    }
}
