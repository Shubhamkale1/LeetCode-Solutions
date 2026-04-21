package arrays;

public class Average {
    static int average(int[] nums){
        int n = nums.length;
        int sum = 0;
        for (int i=0; i<n; i++){
            sum = sum + nums[i];
        }
        return sum = sum / n;
    }

    public static void main(String[] args) {
        int[] nums = {10,20,30,40};
        System.out.println(average(nums));
    }
}
