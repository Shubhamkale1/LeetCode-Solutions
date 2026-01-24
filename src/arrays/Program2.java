// Leaf year
package arrays;

public class Program2 {
    public static void main(String[] args) {
        int year = 2025;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leaf year");
        } else {
            System.out.println(year + " is not leaf year");
        }
    }
}
