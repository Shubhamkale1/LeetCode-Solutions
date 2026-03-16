package Tree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightView {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.val = value;
        }
    }
//    private TreeNode root;
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode curretNode = queue.poll();

                if (i == levelSize-1){
                    result.add(curretNode.val);
                }
                if (curretNode.left != null){
                    queue.offer(curretNode.left);
                }
                if (curretNode.right != null){
                    queue.offer(curretNode.right);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);

        List<Integer> ans = rightSideView(root);
        System.out.println(ans);

    }
}
