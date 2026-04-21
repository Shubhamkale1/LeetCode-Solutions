package arrays;

public class CanPlaceFlower {
    public static void main(String[] args) {
        int[] flowers = {1,0,0,0,0,0,1};
        int n = 2;
        System.out.println(placeFloweres(flowers,n));
    }
    static boolean placeFloweres(int[] flowerbed, int n) {
        if (n==0){
            return true;
        }
        int length = flowerbed.length;
        for (int i = 1; i < length; i++) {
            if (flowerbed[i] == 1){
                continue;
            }
            boolean leftSide = false;
            if (i==0){
                leftSide = true;
            } else if (flowerbed[i - 1] == 0) {
                leftSide = true;
            }
            boolean rightSide = false;
            if (i == length-1){
                rightSide = true;
            } else if (flowerbed[i+1] == 0) {
                rightSide = true;
            }
            if (leftSide && rightSide){
                flowerbed[i] = 1;
                n--;
            }
            if (n == 0){
                return true;
            }
        }
        return false;
    }
}
