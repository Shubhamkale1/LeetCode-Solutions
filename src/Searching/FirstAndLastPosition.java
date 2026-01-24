package Searching;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);

        System.out.println("First Position: " + result[0]);
        System.out.println("Last Position: " + result[1]);
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        ans[0] = binarySearch(nums, target, true);{
            if (ans[0] != -1){
                ans[1] = binarySearch(nums, target, false);
            }
        }
        return ans;
    }
     static int binarySearch(int[] nums, int target, boolean findFirst) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else {
                ans = mid;
                if (findFirst == true){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
