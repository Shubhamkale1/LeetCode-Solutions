package project;

import java.util.Scanner;

public class ATM_Simulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Pin = 1234;
        int balance = 5000;

        System.out.println("....Welcome To Java ATM....");
        System.out.println("Enter Pin: ");
        int UserPin = sc.nextInt();

        if (UserPin != Pin) {
            System.out.println("Wrong Pin! Try Again..");
            return;
        }
        while (true) {
            System.out.println("\n.....ATM Menu....");
            System.out.println("1)  Check Balance   ");
            System.out.println("2)  Deposit Money   ");
            System.out.println("3)  Withdraw Money  ");
            System.out.println("4)   EXIT           ");
            System.out.println("Choose An Option");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your Balance " + balance);
                    break;
                case 2:
                    System.out.println("Enter Deposit Amount: ");
                    int deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Amount Deposited: ");
                    break;
                case 3:
                    System.out.println("Enter Withdraw Amount: ");
                    int withdraw = sc.nextInt();
                    if (withdraw > balance) {
                        System.out.println("Insufficiant Amount: ");
                    } else {
                        balance = balance - withdraw;
                        System.out.println("Withdraw Successfully: ");
                        break;
                    }
                case 4:
                    System.out.println("thanku for ATM using....");
                    return;

                default:
                    System.out.println("Invalid option:....");

            }

        }
    }
}
