package Arrays.Questions;
/*
  find the total number of pair in the Arrays whose sum is equal to the given value x.
  input : [4,6,3,5,8,2], target = 7
  output: 2   => [4,3] or [5,2]
 */


public class Question_8 {

    static int PairSum(int arr[], int target){
        int n = arr.length;
        int ans = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {4,6,3,5,8,2};
        int res = PairSum(arr,7);

        System.out.println("Total Pair : "+res);
    }

}
