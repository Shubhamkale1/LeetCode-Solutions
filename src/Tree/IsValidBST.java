package Tree;
public class IsValidBST {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.val = value;

        }
    }
    public boolean isValidBST(TreeNode root) {
            return helper(root, null, null);
    }

    private boolean helper(TreeNode root, Integer low, Integer high) {
        if (root == null){
            return true;
        }
        if (low != null && root.val <= low){
            return false;
        }
        if (high != null && root.val >= high){
            return false;
        }
        boolean left = helper(root.left,low, root.val);
        boolean right = helper(root.right,root.val, high);

        return left && right;
    }

    public static void main(String[] args) {
        IsValidBST sol = new IsValidBST();
        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(20);

        boolean result = sol.isValidBST(root);
        System.out.println(result);

    }
}
