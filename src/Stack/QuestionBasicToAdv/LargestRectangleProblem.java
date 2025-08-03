package Stack.QuestionBasicToAdv;

import java.util.Stack;

public class LargestRectangleProblem {
    static int Solution(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();

        int[] nse = new int[n];
        int[] pse = new int[n];

        nse[n - 1] = n;
        st.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            if (heights[i] <= heights[st.peek()]) {
                while (!st.isEmpty() && heights[i] <= heights[st.peek()]) {
                    st.pop();

                }
                if (st.isEmpty()) {
                    nse[i] = n;
                    st.push(i);
                } else {

                    nse[i] = st.peek();
                    st.push(i);
                }

            } else {
                nse[i] = st.peek();
                st.push(i);
            }
        }

        while (!st.isEmpty()) {
            st.pop();
        }

        pse[0] = -1;
        st.push(0);
        for (int i = 1; i < n; i++) {
            if (heights[i] <= heights[st.peek()]) {
                while (!st.isEmpty() && heights[i] <= heights[st.peek()]) {
                    st.pop();

                }
                if (st.isEmpty()) {
                    pse[i] = -1;
                    st.push(i);
                } else {

                    pse[i] = st.peek();
                    st.push(i);
                }

            } else {
                pse[i] = st.peek();
                st.push(i);
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            int largest = heights[i] * (nse[i] - pse[i] - 1);
            max = Math.max(max, largest);

        }

        return max;


    }

    public static void main(String[] args) {
        int[] heights = {1, 1};
        System.out.println(Solution(heights));


    }
}
