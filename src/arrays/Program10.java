package arrays;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        while (true) {
            System.out.println("enter numbers: ");
            String input = sc.next();
            // int sum = 0;
            if (input.equals("x")) break;
            num = Integer.parseInt(input);
            sum = sum + num;
        }
        System.out.println(sum + num);
    }
}

