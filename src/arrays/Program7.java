// leaf year

package arrays;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter year: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input: ");
                sc.next();
                continue;
            }

            int num = sc.nextInt();
            if ( ((num % 4 == 0) && (num % 100 != 0)) || (num % 400 == 0))  {
                System.out.println("is a leaf year");
            }else {
                System.out.println("not leaf year");
            }
            System.out.println("do you want enter again(yes/no): ");
            if (sc.next().toLowerCase().equals("no")) break;

        }
    }
}
