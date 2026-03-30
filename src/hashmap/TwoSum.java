package hashmap;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i< nums.length; i++){
            int sum = 0;
            for (int j=i; j<nums.length; j++){
                sum = sum + nums[j];
                if (sum == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        TwoSum sum = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = sum.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
