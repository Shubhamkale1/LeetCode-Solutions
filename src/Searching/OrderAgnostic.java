package Searching;
// Find in Mountain Array
public class OrderAgnostic {
    static int OrderAgnosticc(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

//      find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            }
            // for ascending order
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }

//          for descending order
            }else {
                if (target > arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {90, 80, 75,22,11,5,2,-3};
        int target = 11;
        System.out.println(OrderAgnosticc(arr, target));
    }
}
