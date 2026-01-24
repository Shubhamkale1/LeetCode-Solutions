// Check a number is even or odd

package arrays;

public class Program1 {
    public static void main(String[] args) {
//        int number = 20;
        int[] numbers = {20, 35, 30, 50, 24, 15};
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " is even ");
            } else {
                System.out.println(number + " not even ");
            }
        }
    }
}
