package arrays;

import java.util.Arrays;

public class MoveZeroes {
    static void movezeroes(int[] nums){
        int index = 0;
        for (int i=0; i< nums.length; i++){
            if (nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
            while (index < nums.length){
                nums[index] = 0;
                index++;
            }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,12,23,15,0};
        movezeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
