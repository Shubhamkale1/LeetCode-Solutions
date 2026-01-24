package arrays;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println(" enter first number: ");
            int a = sc.nextInt();

            System.out.println("enter second number: ");
            int b = sc.nextInt();
            int num1 = a;
            int num2 = b;

            while (num2 != 0){
                int rem = num1 % num2;
                num1 = num2;
                num2 = rem;
            }
            int hcf = num1;

            int lcm = (a * b) / hcf;

            System.out.println(hcf);
            System.out.println(lcm);
        }
    }
}
