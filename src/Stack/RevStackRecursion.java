package Stack;

import java.util.Stack;

public class RevStackRecursion {
    static void reverseStack(Stack<Integer> st){
        if (st.size() == 0){
            return;
        }
        int val = st.pop();
        reverseStack(st);
        System.out.print(val+" ");
    }
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        reverseStack(st);

    }
}
