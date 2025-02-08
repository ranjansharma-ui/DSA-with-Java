package Tree.Binary_Tree.BST;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}

public class DeletionInBST {

    static Node delNode(Node root,int x){
        if (root == null){
            return root;
        }

        // if data to searched is in a subtree
        if (root.data > x){
            root.left = delNode(root.left,x);
        } else if (root.data < x) {
            root.right = delNode(root.right,x);
        }
        else {
            // if root matches with the given key
            // cases when root has 0 children or only right child
            if(root.left == null){
                return root.right;
            }

            // when root has only left child
            if(root.right == null){
                return root.left;
            }

            // when both children are present
            Node succ = getSuccessor(root);
            root.data = succ.data;
            root.right = delNode(root.right, succ.data);
        }
        return root;
    }

    static Node getSuccessor(Node curr){
        curr = curr.right;
        while(curr != null && curr.left != null){
            curr = curr.left;
        }
        return curr;
    }

    public static void InOrder(Node root){
        if (root == null) return;
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    public static void main(String[] args) {
        // manually
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(18);

        int x = 15;
        root = delNode(root,x);
        InOrder(root);
    }
}
