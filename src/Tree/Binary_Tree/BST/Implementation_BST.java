package Tree.Binary_Tree.BST;

import Tree.Binary_Tree.In_order;

public class Implementation_BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;

        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left-subtree
            root.left = insert(root.left,val);

        }
        else {
            root.right = insert(root.right,val);
        }
        return root;
    }

    // in-order
    public static void InOrder(Node root){
        if (root == null) return;

        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }


    public static void main(String[] args) {
        Node root = null;

        root = insert(root,6);
        root = insert(root,3);
        root = insert(root,2);
        root = insert(root,4);
        root = insert(root,16);
        root = insert(root,6);

        InOrder(root);

    }

}
