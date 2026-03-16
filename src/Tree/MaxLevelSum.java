package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxLevelSum {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value) {
            this.val = value;

        }
    }
    public int maxLevelSum(TreeNode root) {
        if (root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int level = 1;
        int maxlevel = 1;
        int maxSum = Integer.MIN_VALUE;

        while (!queue.isEmpty()){
            int size = queue.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum = sum + node.val;

                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }
            if (sum > maxSum){
                maxSum = sum;
                maxlevel = level;
            }
            level++;
        }
        return maxSum;

    }
}
