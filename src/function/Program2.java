// Addition of two numbers

package function;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("enter the second number: ");
        int num2 = sc.nextInt();

        sumNum(num1,num2);

//        int sum = num1 + num2;
//        System.out.println("Sum of two numbers is: " + sum);

    }

    public static void sumNum(int num1, int num2){
        int sumNum = 0;
        sumNum = num1 + num2;
        System.out.println("sum of two number is: " + sumNum);
    }
}
