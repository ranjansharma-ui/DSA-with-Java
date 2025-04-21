package Arrays;


class Solution_11 {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int largestNum = Integer.MIN_VALUE;
        int SecondLargNum = Integer.MIN_VALUE;

        if (n < 2) return -1;

        for (int i=0; i<n; i++){
            if(largestNum < arr[i]){
                SecondLargNum = largestNum;
                largestNum = arr[i];
            } else if (SecondLargNum < arr[i] && arr[i] != largestNum) {
                SecondLargNum = arr[i];

            }

        }

        if (SecondLargNum == Integer.MIN_VALUE){
            return -1;

            
        }
        else {
            return SecondLargNum;
        }








    }
}
public class Question_11 {
    public static void main(String[] args) {
        int arr[] = {-4,-5,-3,-6,-7,-9};
        Solution_11 so = new Solution_11();
        int ans = so.getSecondLargest(arr);
        System.out.println(ans);
    }
}
