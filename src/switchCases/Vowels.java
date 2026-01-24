package switchCases;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Alphabet");
        char ch = sc.next().trim().charAt(0);

        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("vowels");
            default -> System.out.println("not vowels");
        }
    }
}
