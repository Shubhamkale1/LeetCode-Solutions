package arrays;

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {

        /*Subtract the Product and Sum of Digits of an Integer*/
//        int num  = 240;
//        int product = 1;
//        int sum = 0;
//
//        while (num > 0){
//             int digit = num%10;
//             product = digit*product;
//             sum = sum+digit;
//             num = num/10;
//        }
//        int result = product - sum;
//        System.out.println(result);


        /*Input a number and print all the factors of that number*/
//        int num = 12;
//        for (int i=1; i<=num; i++){
//            if(num % i == 0){
//                System.out.print(" "+i); ;
//            }
//        }

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Enter Numbers: ");
            int num = sc.nextInt();
            if (num == 0){
                break;
            }
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
