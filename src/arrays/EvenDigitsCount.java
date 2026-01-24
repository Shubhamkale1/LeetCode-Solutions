package arrays;

public class EvenDigitsCount {
    public static void main(String[] args) {
        int[] num = {12, 234, 4567, 1, 45};
        System.out.println(findEven(num));
    }
    static int findEven(int[] nums){
        int count = 0;
        for(int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num){
        if(num == 0){
            return 1;
        }
        int count = 0;
        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
