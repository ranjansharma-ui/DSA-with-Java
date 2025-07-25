package Stack;

import java.util.Stack;

public class RemoveButtom {
    public static void RemoveFromButtom(Stack<Integer> st){
        Stack<Integer> rt = new Stack<>();
        while(st.size() > 1){
            rt.push(st.pop());
        }
        st.pop();

        while (rt.size() > 0){
            st.push(rt.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        RemoveFromButtom(st);
        System.out.println(st);
    }
}
