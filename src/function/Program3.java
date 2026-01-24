package function;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        checkVote(age);
    }
    public static void checkVote(int age){
        if (age >= 18){
            System.out.println("is eligible for vote: ");
        }else {
            System.out.println("is not eligible for vote: ");
        }
    }
}
