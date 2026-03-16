package Tree;

import javax.management.Query;
import java.util.LinkedList;
import java.util.Queue;

public class Flatten {
    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode curr = root;
        while (curr != null){
            if (curr.left != null){
                TreeNode temp = curr.left;
                while (temp.right != null){
                    temp = temp.right;
                }
                temp.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        preordr(root, queue);
//        TreeNode current = queue.poll();
//
//        while (!queue.isEmpty()){
//            current.left = null;
//            current.right = queue.peek();
//            current = queue.poll();
//        }
//    }
//    private void preordr(TreeNode node, Queue<TreeNode> queue) {
//        if (node == null){
//            return;
//        }
//        queue.offer(node);
//        preordr(node.left, queue);
//        preordr(node.right, queue);
//    }

//    TreeNode prev = null;
//
//        flatten(root.left);
//        flatten(root.right);
//
//        root.left = null;
//        root.right = prev;
//
//        prev = root;


    }
}
