package Linked_List.Questions;

/*
   Can we delete a node given the node itself as parameter ?


   note:- is there any efficient way, provided that the given node is not the last node?

 */

import Linked_List.Actual_Implementation.implementation;

public class Question_1 {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

    }

    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    //solving
    public static void DeleteNode(Node a){
        a.data = a.next.data;
        a.next = a.next.next;





    }


    public static void main(String[] args) {
        //given linked-list
        Node a = new Node(13);
        Node b = new Node(1);
        Node c = new Node(100);
        Node d = new Node(20);
        Node e = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        Node temp = a;

        DeleteNode(d);

        display(temp);



    }
}
