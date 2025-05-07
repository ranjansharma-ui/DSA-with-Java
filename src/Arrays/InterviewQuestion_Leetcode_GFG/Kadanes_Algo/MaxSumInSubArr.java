package Arrays.InterviewQuestion_Leetcode_GFG.Kadanes_Algo;

public class MaxSumInSubArr {
    public static int kandanes(int arr[]) {
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < n; i++) {
            currSum = currSum + arr[i];

            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Max Subarray sum is : " + kandanes(arr));
    }
}
