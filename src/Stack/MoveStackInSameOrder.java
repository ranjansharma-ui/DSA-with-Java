package Stack;

import java.util.Scanner;
import java.util.Stack;

public class MoveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
//        int n ;
//        System.out.println("Enter the number of  Elements you want to insert");
//        n = sc.nextInt();
//        System.out.println("Enter the Elements: ");
//        for(int i=1; i<=n; i++){
//            int x = sc.nextInt();
//            st.push(x);
//        }
//
//        System.out.println(st);

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        Stack<Integer> gt = new Stack<>();
        while (st.size()>0){
            gt.push(st.pop());

        }
        System.out.println(gt);
        Stack<Integer> rt = new Stack<>();
        while (gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
    }
}
