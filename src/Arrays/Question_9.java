package Arrays;
/* Q.
    find the total number of pair in the Arrays of triple whose sum is equal to the given value x.
    input : [1,4,5,6,3]
    output: 2 => [1,5,6] or [4,5,3]

 */


public class Question_9 {

    static int PairSum(int arr[], int x){
        int n = arr.length;
        int ans = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k] == x){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,4,5,6,3};
        int res = PairSum(arr,12);
        System.out.println("Total Pair : "+res);
    }
}
