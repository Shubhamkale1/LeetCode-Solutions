package Tree;

public class SortedArrayToBST {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value) {
            this.val = value;

        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return BinarySearch(nums,0,nums.length-1);

    }

    private TreeNode BinarySearch(int[] nums, int start, int end) {
        if (start > end){
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = BinarySearch(nums,start, mid-1);
        root.right = BinarySearch(nums,mid+1, end);

        return root;
    }
}
