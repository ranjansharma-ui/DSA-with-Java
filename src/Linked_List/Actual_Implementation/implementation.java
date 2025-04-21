package Linked_List.Actual_Implementation;


public class implementation {
    public static  class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;



        //method - (1)
        void insertAtEnd(int val){
            //creation node firstly
            Node temp = new Node(val);

            if(head == null){
                head = tail;

            }
            else{
                tail.next = temp;

            }
            tail = temp;
            size++;
        }

        //method - (2)
        void insertAtHead(int val){

            Node temp = new Node(val);

            if(head == null){
//                head = tail = null;
                //or
                insertAtEnd(val);
            }
            else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

        //method - (3)
        void insertAt(int idx, int val){
            Node t = new Node(val);

            Node temp = head;

            if(idx == size){
                insertAtEnd(val);
                return;

            } else if (idx == 0) {
                insertAtHead(val);
                return;

            }
            else if(idx <0 || size < idx){
                System.out.println("Wrong Index!");
            }

            for (int i=1; i<idx-1; i++){
                temp = temp.next;

            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }


        //method-(4)
         int getAt(int idx){
            if(idx < 0 || size < idx){
                System.out.println("Wrong Index!");
            }

            Node temp = head;
            for(int i=0; i<idx; i++){
                temp = temp.next;
            }
            return temp.data;
         }

         //method -(5)
        void deleteAt(int idx){
            Node temp = head;

            if(idx == 0){
                head = head.next;
                size--;
            }

            for(int i=0; i<idx-1; i++){
                temp = temp.next;

            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }

        int size(){
            int count =0;
            Node temp = head;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return size;
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnd(4);
        ll.insertAtEnd(3);

        ll.insertAtHead(5);
        ll.insertAtHead(10);

        ll.insertAt(2,34);
        ll.insertAt(0,100);
        ll.insertAt(4,10);

        ll.display();

    }

}
