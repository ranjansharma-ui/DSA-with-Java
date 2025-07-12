package Stack;
import java.util.*;

//import java.util.ArrayList; // header file
//import java.util.Stack;

public class BasicOfStack {
    public static void main(String[] args) {
        //int[] arr = new int[5];
        //ArrayList<Integer> arr = new ArrayList<>();

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(5);
        st.push(30);
        System.out.println(st);

        //peek
        System.out.println(st.peek());
        //pop -> delete of top element
        st.pop();
        System.out.println(st);
        //size of stacks
        System.out.println("Size is : "+st.size());

//        while (st.size()>1) { // reason of this technique stack has deleted
//            st.pop();
//        }
//        System.out.println(st.peek());
//        System.out.println(st);

        System.out.println(st.isEmpty());

    }
}
