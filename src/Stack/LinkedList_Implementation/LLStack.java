package Stack.LinkedList_Implementation;

public class LLStack {
    public static class Node{
        int val;
        Node next;

        Node(int data){
            this.val = data;
        }
    }
    public static class Stack{
        Node head = null;
        int size = 0;

        //push()
        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            size++;
            head = temp;
        }
        //pop()
        int pop(){
            if (head == null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = head.val;
            head = head.next;
            size--;
            return top;
        }
        //peek()
        int peek(){
            if (head == null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.val;
        }
        void displayrecursive(Node h){
            if (h == null) return;
            displayrecursive(h.next);
            System.out.print(h.val+" ");

        }
        void display(){
            displayrecursive(head);
        }
        //display()
        void displayRev(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
        }
        int size(){
            return size;
        }


    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.push(4);
        st.push(8);
        st.push(21);
        st.display();
        System.out.println();
        System.out.println(st.head.val);
        st.pop();
        st.display();
        int x = st.pop();
        int y = st.peek();
        System.out.println();
        System.out.println(x+" "+y);
        System.out.println(st.size);

    }
}
