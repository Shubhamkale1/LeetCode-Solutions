package Tree;

import java.util.*;

public class SD {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.val = value;
        }
    }
//    public List<String> serialize(TreeNode root) {
//        List<String> list = new ArrayList<>();
//        helper(root, list);
//        return list;
//    }
//    public void helper(TreeNode root, List<String> list) {
//        if (root == null) {
//            list.add("null");
//            return;
//        }
//        list.add(String.valueOf(root.val));
//        helper(root.left, list);
//        helper(root.right, list);
//    }
//
//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(List<String> list) {
//        Collections.reverse(list);
//        return build(list);
//
//    }
//
//    private TreeNode build(List<String> list) {
//        String val = list.remove(list.size()-1);
//        if (val.equals("null")){
//            return null;
//        }
//        TreeNode node = new TreeNode(Integer.parseInt(val));
//
//        node.left = build(list);
//        node.right = build(list);
//
//        return node;
//    }

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helper(root,sb);
        return sb.toString();
    }

    private void helper(TreeNode root, StringBuilder sb) {
        if (root == null){
            sb.append("null,");
            return;
        }
        sb.append(root.val).append(",");
        helper(root.left, sb);
        helper(root.right, sb);
    }

    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        Queue<String> queue = new LinkedList<>(Arrays.asList(arr));
        return build(queue);

    }

    private TreeNode build(Queue<String> queue) {
    String val = queue.poll();
    if (val.equals("null")){
        return null;
    }
    TreeNode node = new TreeNode(Integer.parseInt(val));
    node.left = build(queue);
    node.right = build(queue);

    return node;

    }
}
