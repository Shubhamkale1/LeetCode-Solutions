package sorting.cyclicSorting;

import java.util.Arrays;

public class SetMismatch {
    static int[] mismatch(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index+1){
                return new int[]{arr[index], index + 1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
//        System.out.println(Arrays.toString(mismatch(arr)));
        int[] ans = mismatch(arr);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
