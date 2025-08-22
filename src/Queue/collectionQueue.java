package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class collectionQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //or
        Queue<Integer> q2 = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        q.poll();
        q.remove();
        System.out.println(q);

    }
}
