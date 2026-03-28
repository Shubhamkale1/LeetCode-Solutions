package Tree;

public class BuildTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value) {
            this.val = value;
        }
    }
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder,0,inorder.length-1);

    }

    private TreeNode helper(int[] preorder, int[] inorder, int start, int end) {

        if (start > end){
            return null;
        }
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        int index = 0;
        for (int i=start; i<=end; i++){
            if (inorder[i] == rootVal){
                index = i;
                break;
            }
        }
        root.left = helper(preorder, inorder,start,index-1);
        root.right = helper(preorder, inorder,index+ 1,end);

        return root;
    }
    public static void printInorder(TreeNode root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        printInorder(root.left);
        printInorder(root.right);
    }

    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder  = {9, 3, 15, 20, 7};

        BuildTree sol = new BuildTree();
        TreeNode root = sol.buildTree(preorder, inorder);

        System.out.print("Inorder of constructed tree: ");
        printInorder(root);
    }
}
