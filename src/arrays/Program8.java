package arrays;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for (int i=1; i<num; i++){

            System.out.println(num+" x "+ i +" = "+ num * i);
        }
    }
}
