package arrays;

public class RichestCustomer {
    static int customerWealth(int[][] accounts){
        int maxWealth = 0;

//        for (int[] customer : accounts){
//            int sum = 0;
//            for (int money : customer){
//                sum = sum + money;
//            }
//            maxWealth = Math.max(maxWealth ,sum);
//        }
        for (int i=0; i<accounts.length; i++){
            int sum = 0;
            for (int j=0; j<accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
             maxWealth = Math.max(maxWealth ,sum);
        }
        return maxWealth;
    }


    public static void main(String[] args) {
        int[][] account = {{1,2,3}, {3,1,2}, {4,3,2}};
        System.out.println(customerWealth(account));
    }
}
