package Queue.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementationUsingQueues {
    public static class queue {
        Queue<Integer> q = new LinkedList<>();

        //push
        void push(int val){
            q.add(val);
        }
        //pop
        public int pop(){
            for (int i=1; i<q.size()-1; i++){
                q.add(q.remove());
            }
            int val = q.peek();
            q.remove();
            return val;
        }
        //peek
        int peek(){
            for (int i=1; i<q.size()-1; i++){
                q.add(q.remove());

            }
            int val = q.peek();
            return val;
        }
//        //display
//        void display(){
//            while(q.size() > 0){
//                System.out.print(q.peek()+" ");
//                q.poll();
//            }
//            System.out.println();
//        }
    }
    
    public static void main(String[] args) {

          queue st = new queue();
          st.push(3);
          st.push(5);
          st.push(6);
          st.push(9);
          st.push(10);
//          st.display();
//          st.pop();
//          st.display();
    }
}
