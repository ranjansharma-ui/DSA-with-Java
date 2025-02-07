package Tree.Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;

    }

}

class BinaryTree{
    static Node Insertion(Node root,int key){
        if(root == null){
            root = new Node(key);
            return root;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node curr = q.poll();

            if(curr.left != null){
                q.add(curr.left);
            }else{
                curr.left = new Node(key);
                return root;
            }

            if (curr.right != null){
                q.add(curr.right);
            }
            else{
                curr.right = new Node(key);
                return root;
            }
        }
        return root;
    }

    public static void InOrder(Node root){
        if(root == null) return;

        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);


    }
}




public class Insertion_In_BT {
    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(11);
        root.right = new Node(9);
        root.left.left = new Node(7);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        root = BinaryTree.Insertion(root,12);

        BinaryTree.InOrder(root);
    }

}
