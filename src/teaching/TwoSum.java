package teaching;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public  static int[] twoSum(int[] nums, int target){
//        for (int i=0; i< nums.length; i++) {
//            int sum = 0;
//            for (int j = i; j<nums.length; i++) {
//                sum = sum + nums[j];
//                if (sum == target) {
//                    return new int[]{i,j};
//                }
//            }
//        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int need = target - nums[i];

            if (map.containsKey(need)){
                return new int[]{map.get(need),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
