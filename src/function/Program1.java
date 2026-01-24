//find the Largest and Smallest of three Integers

package function;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("enter second: ");
        int num2 = sc.nextInt();
        System.out.println("enter third number: ");
        int num3 = sc.nextInt();

        int max = max(num1, num2, num3);
        int min = min(num1, num2, num3);

        System.out.println(max);
        System.out.println(min);


    }
    static int max(int num1, int num2, int num3){
        int maxNum = num1;
        if (num2 > maxNum){
            maxNum = num2;
        }
        if (num3 > num1){
            maxNum = num3;
        }
        return maxNum;
    }

    static int min(int num1, int num2, int num3){
        int minNum = num1;
        if (num2 < minNum){
            minNum = num2;
        }
        if (num3 < minNum){
            minNum = num3;
        }
        return minNum;
    }
}
