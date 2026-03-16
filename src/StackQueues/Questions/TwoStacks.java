package StackQueues.Questions;

import java.util.ArrayList;
import java.util.List;

public class TwoStacks {
    static int twoStacks(int masSum, List<Integer> a, List<Integer> b){
        int sum = 0;
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < a.size() && sum + a.get(i) <= masSum){
            sum = sum + a.get(i);
            i++;
        }
        count = i;

        while (j < b.size()){
            sum = sum + b.get(j);
            j++;
            while (sum > masSum && i > 0){
                i--;
                sum = sum - a.get(i);
            }
            if (sum > masSum){
                break;
            }
            count = Math.max(count , i+j);
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(4);
        a.add(2);
        a.add(4);
        a.add(6);
        a.add(1);

        b.add(2);
        b.add(1);
        b.add(8);
        b.add(6);

        int maxSum = 10;
        System.out.println(twoStacks(maxSum,a,b));
    }
}
