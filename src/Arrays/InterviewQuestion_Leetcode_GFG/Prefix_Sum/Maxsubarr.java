package Arrays.InterviewQuestion_Leetcode_GFG.Prefix_Sum;

public class Maxsubarr { // T.c => O(N^2)
    public static void PrefixSum_MaxSub(int[] arr){
        int n = arr.length;
        int MaxSum = Integer.MIN_VALUE;
        int currSum = 0;
        // calculate prefix Sum
        int[] preSum = new int[n];
        preSum[0] = arr[0];
        for (int i=1; i<n; i++){
            preSum[i] = preSum[i-1]+arr[i];
        }

        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                currSum = i == 0 ? preSum[j]:preSum[j] - preSum[i-1];
                System.out.print("("+currSum+")");

                if (MaxSum < currSum){
                    MaxSum = currSum;
                }
            }
            System.out.println();

        }

        System.out.println("Max sum : "+ MaxSum);

        for(int i=0; i<n; i++){
            System.out.print(preSum[i]+" ");
        }

    }
    public static void main(String[] args) {
        int[]arr = {-2,-3,4,-2,-1, 5};
        PrefixSum_MaxSub(arr);
    }
}
