package arrays;

import java.util.Scanner;

public class   Program12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }
}

