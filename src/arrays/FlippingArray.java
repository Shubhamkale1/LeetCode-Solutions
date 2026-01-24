package arrays;

import java.util.Arrays;

public class FlippingArray {
    static int[][] flip(int[][] image){
        for (int i=0; i<image.length; i++){
            int start = 0;
            int end = image[i].length -1;
            while (start < end){
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }

        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.toString(flip(image)));
    }
}
