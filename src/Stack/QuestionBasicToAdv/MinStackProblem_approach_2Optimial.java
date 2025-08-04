package Stack.QuestionBasicToAdv;

import java.util.Stack;

class MinStack2 {
    MinStack2(){
        //constructor
    }
    Stack<Integer> st = new Stack<>();
    int min = -1;

    void push(int val){
        if (st.size() == 0){
            st.push(val);
            min = val;
        }
        else if (min <= val){
            st.push(val);
        }
        else{
            int Fz = 2*val - min;
            st.push(Fz);
            min = val;

        }
    }
    void pop(){
        if (st.size() == 0) return;
        if (st.peek() > min) st.pop();
        else {
            int old = 2*min - st.peek();
            min = old;
            st.pop();
        }
    }
    int peek(){
        if (st.size() == 0) return -1;
        else if (st.peek() > min) return st.peek();
        else {
            return min;
        }

    }
    int getMin(){
        if (st.size() == 0) return -1;
        return min;
    }
}
public class MinStackProblem_approach_2Optimial {
    public static void main(String[] args) {

        MinStack2 m2 = new MinStack2();
//        m2.push(7);
//        m2.push(8);
//        m2.push(5);
//        m2.push(6);
//        m2.push(3);
//        m2.push(4);
//        m2.pop();
//        m2.pop();

        m2.push(-2);
        m2.push(0);
        m2.push(-1);


        System.out.println(m2.getMin());
        System.out.println(m2.peek());
        m2.pop();
        System.out.println(m2.getMin());
    }
}
