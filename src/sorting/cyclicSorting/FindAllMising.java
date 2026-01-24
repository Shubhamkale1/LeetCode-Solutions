package sorting.cyclicSorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllMising {
    static List<Integer> findMissing(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]) {
                swap(arr, i , correct);
            }else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index+1){
                ans.add(index + 1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1};
        System.out.println(findMissing(arr));

    }
}
