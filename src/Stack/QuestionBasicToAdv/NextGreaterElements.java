package Stack.QuestionBasicToAdv;

import java.util.Stack;

public class NextGreaterElements {
    public static int[] Solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];

        res[n - 1] = -1;
        st.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() < arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);

        }


        return res;

    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 6, 5, 2, 4, 2};
        arr = Solution(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
