package Tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value) {
            this.val = value;
        }
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root,result);
        return result;
    }
    private static void helper(TreeNode root, List<Integer> result) {
        if (root == null){
            return;
        }
        helper(root.left,result);
       result.add(root.val);
        helper(root.right,result);
    }
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(3);

        System.out.println(inorderTraversal(node));
    }

}
