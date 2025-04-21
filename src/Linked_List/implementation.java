package Linked_List;

public class implementation {
    public static class Node {
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
        }
    }
    public static void PrintLinkedlist(Node head){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static void main(String[] args) {


        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(9);


        // connection
        a.next = b;
        b.next = c;
        c.next = null;

        Node temp = a; // head

        PrintLinkedlist(temp);





    }
}
