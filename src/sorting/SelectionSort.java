package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        search(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void search(int[] arr){
        for (int i=0; i< arr.length; i++){
            int last = arr.length-i-1;
            int maxIndex = getMax(arr, 0, last);
            swap(arr,maxIndex, last);
        }
    }
    static int getMax(int[] arr, int start, int last){
        int max = start;
        for (int i=start; i< last; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
