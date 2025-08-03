package Stack.QuestionBasicToAdv;

import java.util.Stack;

public class StockSpanProblem {
    public static int[] Solution(int[] price) {
        Stack<Integer> st = new Stack<>();
        int n = price.length;
        int[] res = new int[n];
        res[0] = 1;
        st.push(0);

        for (int i = 1; i < n; i++) {
            if (price[i] < price[st.peek()]) {
                res[i] = i - st.peek();
                st.push(i);
            } else {
                while (price[i] > price[st.peek()]) {
                    st.pop();

                }
                res[i] = i - st.peek();
                st.push(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int price[] = {100, 80, 60, 70, 60, 75, 85};
        int ans[] = Solution(price);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
