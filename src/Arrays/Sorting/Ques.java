package Arrays.Sorting;

import java.util.Arrays;

public class Ques {
    public static int maxProduct(int[] arr) {
        // code here

        Arrays.sort(arr);

        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        int left = 0;
        int right = n-1;

        while(left<right){

            if(left == right){
                return ans;
            }

//            if(arr[left]) < arr[right]){
//                left++;
//            }

            if(arr[left] * arr[right] > ans){
                ans = arr[left]*arr[right];


            }
            left++;
        }

        return ans;

    }

    public static void main(String[] args) {
        int ans[] = {-5,-3,2,3,4,-5};
        System.out.println(maxProduct(ans));

    }
}
