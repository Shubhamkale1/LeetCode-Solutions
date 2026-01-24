package switchCases;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter grade: ");
        char ch = sc.next().toUpperCase().trim().charAt(0);
//        A → Excellent
//        B → Good
//        C → Average
//        D → Poor
//        F → Fail

        switch (ch){
            case 'A' -> System.out.println("Excellent");
            case 'B' -> System.out.println("Good");
            case 'C' -> System.out.println("Average");
            case 'D' -> System.out.println("poor");
            case 'F' -> System.out.println("Fail");
            default -> System.out.println("enter valid input");

        }
    }
}
