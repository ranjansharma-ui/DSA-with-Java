package Tree.Binary_Tree;
import static Tree.Binary_Tree.Implementation_of_BT.Binary_tree;
public class In_order {

    public static void InorderTraversal(Implementation_of_BT.Node root){
        if (root == null) return;

        InorderTraversal(root.left);
        System.out.print(root.data+" ");
        InorderTraversal(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binary_tree b = new Binary_tree();
        Implementation_of_BT.Node root = b.buildtree(nodes);
        InorderTraversal(root);
    }

}
