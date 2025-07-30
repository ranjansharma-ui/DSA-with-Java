package Stack.QuestionBasicToAdv;

import java.util.Stack;

public class ConsecutiveSubsequenceProblem {
    public static int[] Solution(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty()) st.push(arr[i]);
            else if (st.peek() != arr[i]) st.push(arr[i]);
            else if (st.peek() == arr[i]) {
                if (arr[i] != arr[i + 1]) st.pop();
            }
        }

        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 10, 10, 4, 4, 4, 7, 7, 2};
        arr = Solution(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
