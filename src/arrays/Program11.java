package arrays;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int input = sc.nextInt();

        for (int i=2; i<input/2; i++){
            if (input % i == 0){
                System.out.println("is not a prime");
            }else {
                System.out.println("is not prime");
            }
        }
    }
}
