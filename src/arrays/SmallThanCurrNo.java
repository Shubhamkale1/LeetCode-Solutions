package arrays;

import java.util.Arrays;

public class SmallThanCurrNo {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(small(nums)));

    }
    static int[] small(int[] nums){
       int n = nums.length;
       int[] result = new int[n];

       for (int i=0; i<n; i++){
           int count = 0;

            for (int j=0; j<n; j++){
                if (nums[j] < nums[i]){
                    count++;
                }
            }
            result[i] = count;
       }
       return result;
    }
}
