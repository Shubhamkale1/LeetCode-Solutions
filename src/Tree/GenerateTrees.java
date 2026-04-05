package Tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

import static jdk.internal.classfile.impl.DirectCodeBuilder.build;

public class GenerateTrees {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int value) {
            this.val = value;
        }
    }
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return build(1, n);
    }

    private List<TreeNode> build(int s, int e) {
        List<TreeNode> list = new ArrayList<>();

        if (s > e) {
            list.add(null);
            return list;
        }

        for(int i=s; i<e; i++){
            List<TreeNode> leftmost = build(s,i-1);
            List<TreeNode> rightmost = build(i+1,e);
             for (TreeNode left : leftmost){
                 for (TreeNode right : rightmost){

                     TreeNode root = new TreeNode(i);
                     root.left = left;
                     root.right = right;

                     list.add(root);
                 }
             }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
    }
}
