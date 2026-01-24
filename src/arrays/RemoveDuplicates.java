package arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    static int removeDupalicates(int[] nums){
        if (nums.length == 0){
            return 0;
        }
        int i = 0;
        for (int j=0; j< nums.length; j++){
            if (nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};

        int k = removeDupalicates(nums);

        System.out.println("Unique count: " + k);
        System.out.print("Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
