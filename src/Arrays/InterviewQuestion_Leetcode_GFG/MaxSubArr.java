package Arrays.InterviewQuestion_Leetcode_GFG;

public class MaxSubArr {
    //Brute Force Approach  O(n^3) go further obtimal approach which is (PREFIX SUM)
    public static void PrintMaxSum(int[] arr){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                currSum = 0;
                for (int k=i; k<=j; k++){
                    //subarray sum
                    currSum += arr[k];
                }
                System.out.print(currSum+" ");

                if (currSum > maxSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum Sum of Subarray : "+maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {-1,-2,6,-1,3};
        PrintMaxSum(arr);

    }
}
