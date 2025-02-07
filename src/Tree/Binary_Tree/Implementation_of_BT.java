package Tree.Binary_Tree;

public class Implementation_of_BT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binary_tree{
        static int idx = -1;

        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx] == -1) return null;

            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);

            return newnode;
        }
    }

    //for checking any traversal technique
    // consider pre-order traversal
    public static void pre_order(Node root){
        if(root == null) return;

        System.out.print(root.data+" ");
        pre_order(root.left);
        pre_order(root.right);
    }


    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_tree b = new Binary_tree();
        Node root = b.buildtree(nodes);
        pre_order(root);

    }
}
