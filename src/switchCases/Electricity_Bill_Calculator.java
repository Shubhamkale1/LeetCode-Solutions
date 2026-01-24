package switchCases;

import java.util.Scanner;

public class Electricity_Bill_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//       // System.out.print("Enter electricity unit: ");
//        int unit = sc.nextInt();
//        int range = (unit - 1) / 100;
//
//        switch (range){
//            case 0:
//                System.out.println(unit * 5);
//                break;
//            case 1:
//                System.out.println(unit * 7);
//                break;
//            default:
//                System.out.println(unit * 10);
//        }

//        if (sc.hasNextInt()){
//            int unit = sc.nextInt();
//            int range = (unit - 1) / 100;
//
//            switch (range){
//                case 0:
//                    System.out.println(unit * 5);
//                    break;
//                case 1:
//                    System.out.println(unit * 7);
//                    break;
//                default:
//                    System.out.println(unit * 10);
//            }
//        }else {
//            System.out.println("Invalid input");
//        }

//        while (true) {
//            System.out.print("Enter electricity unit: ");
//            if (sc.hasNextInt()) {
//                int unit = sc.nextInt();
//                int range = (unit - 1) / 100;
//
//                switch (range) {
//                    case 0:
//                        System.out.println(unit * 5);
//                        break;
//                    case 1:
//                        System.out.println(unit * 7);
//                        break;
//                    default:
//                        System.out.println(unit * 10);
//                }
//            } else {
//                System.out.println("Invalid input");
//            }
//            System.out.println("calculate gain ? (yes/no)");
//            String choice = sc.next().toLowerCase();
//            if (choice.equals("no")) {
//                break;
//            }
//        }
//


        while (true) {
            System.out.print("Enter electricity units: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // clear wrong input
                continue;
            }

            int units = sc.nextInt();
            int range = (units - 1) / 100;
            int bill = switch (range) {
                case 0 -> units * 5;
                case 1 -> units * 7;
                default -> units * 10;
            };

            System.out.println("Total bill: ₹" + bill);

            System.out.print("Calculate again? (yes/no): ");
            if (sc.next().equalsIgnoreCase("no")) break;
        }

        System.out.println("Exiting... Thank you!");
        sc.close();
    }
}

