package Queue.Questions;

import java.util.*;

public class ReOrderQueue {
    public static Queue<Integer> solution(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        int n = q.size();

        for (int i=1; i<=n/2; i++){
            st.push(q.remove());
        }
        while (st.size()>0){
            q.add(st.pop());
        }
        for (int i=1; i<= n/2; i++){
            st.push(q.remove());
        }

        while (st.size() > 0){
            int r = q.remove();
            q.add(st.pop());
            q.add(r);
        }

        while (q.size() > 0){
            st.push(q.remove());
        }
        while (st.size() > 0){
            q.add(st.pop());
        }

        return q;
    }


    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        solution(q);
        System.out.println(q);
       


    }

}
