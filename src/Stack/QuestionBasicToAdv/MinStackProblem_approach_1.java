package Stack.QuestionBasicToAdv;

import java.util.Stack;

class MinStack {
    MinStack(){
        //constructor
    }
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>(); // extra space used;

    void push(int val){
        if (st.size() == 0){
            st.push(val);
            min.push(val);
        } else if (min.peek() < val) {
            st.push(val);
            min.push(min.peek());
        }else {
            st.push(val);
            min.push(val);
        }
    }
    void pop(){
        st.pop();
        min.pop();
    }
    int peek(){
        return st.peek();
    }
    int getMin(){
        return min.peek();
    }
}
public class MinStackProblem_approach_1 {

    public static void main(String[] args) {
        MinStack m = new MinStack();
        m.push(7);
        m.push(8);
        m.push(5);
        m.push(6);
        m.push(3);
        m.push(4);
        m.pop();
        m.pop();

        System.out.println(m.getMin());
    }
}
