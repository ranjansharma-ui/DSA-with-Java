package Tree.Binary_Tree;

public class Post_Order {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;

        }
    }
    public static class BinaryTree{
        static int idx = -1;

        static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1) return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    // Post-order
    public static void Post_Order(Node root){
        if (root == null) return;

        Post_Order(root.left);
        Post_Order(root.right);

        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree b = new BinaryTree();
        Node root = b.buildTree(nodes);

        Post_Order(root);
    }
}
