package Tree;

public class LowestCommonAncestor {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value) {
            this.val = value;

        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null){
            return null;
        }
        if (p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if (p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}
