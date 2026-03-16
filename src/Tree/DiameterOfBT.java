package Tree;

public class DiameterOfBT {
    private static class Node{
        int val;
        Node left;
        Node right;
        int height;

        public Node(int val) {
            this.val = val;
        }
    }
    private Node node;
    static int diameter = 0;

    public static int getHeight(Node node){
        if (node == null){
            return 0;
        }
        return node.height;
    }

    public static int height(Node node){
        if (node == null){
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);

        diameter = Math.max(diameter,left+right);
        return Math.max(left,right) + 1;
    }

    public static void main(String[] args) {
        Node node = new Node(1);

        node.left = new Node(2);
        node.right = new Node(3);

        node.left.left = new Node(4);
        node.left.right = new Node(5);

        height(node);

        System.out.println(diameter);
    }
}
