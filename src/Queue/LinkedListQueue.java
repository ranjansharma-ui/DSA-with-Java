package Queue;

public class LinkedListQueue {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;
    //add()
    void add(int val){
        if (head == null){
            Node temp = new Node(val);
            head = tail = temp;
        }
        else {
            Node temp = new Node(val);
            tail.next = temp;
            tail = temp;
        }
    }
    //remove()
    int remove(){
        int x = head.data;
        head = head.next;
        return x;
    }
    //peek()
    int peek(){
        return head.data;
    }
    //display()
    void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedListQueue lq = new LinkedListQueue();
        lq.add(1);
        lq.add(2);
        lq.add(3);
        lq.add(4);
        lq.add(5);
        lq.display();
        lq.remove();
        System.out.println(lq.peek());
        lq.display();

    }
}
