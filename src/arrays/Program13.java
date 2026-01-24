package arrays;

import java.util.Arrays;

import static java.util.Collections.swap;

public class Program13 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 67, 32, 45, 34, 45};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
