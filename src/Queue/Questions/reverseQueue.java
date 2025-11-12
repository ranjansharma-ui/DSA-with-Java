package Queue.Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void reverse(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while (q.size() > 0){
            st.push(q.remove());
        }
        while (st.size() > 0){
            q.add(st.pop());
        }

    }

    public static void reverseFirst(Queue<Integer> q, int k){
        Stack<Integer> st = new Stack<>();
        while (q.size() > 0){
            st.push(q.poll());
        }
        while (st.size() > 0){
            q.add(st.pop());
        }
        while (q.size() > q.size()-k){
            st.push(q.poll());
        }
        while (st.size() > 0){
            q.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverseFirst(q,3);
        q.remove();
        System.out.println(q);

    }
}
