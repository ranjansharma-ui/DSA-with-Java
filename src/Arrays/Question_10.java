package Arrays;


class Solution {
//    void pushZerosToEnd(int[] arr) {
//        // code here
//        int left = 0;
//        int right = arr.length-1;
//
//        while(left < right){
//
//            if(arr[left] > 0 && arr[right] == 0){
//                left++;
//                right--;
//            }
//            if(arr[left] > 0 && arr[right] >= 0){
//                left++;
//            }
//
//            if(arr[left]==0 && arr[right] > 0){
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//                left++;
//                right--;
//            }
//        }
//    }

    void PushAllZeroTOEnd(int[] arr){
        int n = arr.length;
        int count = 0;

        for (int i=0; i<n; i++){
            if (arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }

        while (count < arr.length){
            arr[count] = 0;
            count++;
        }
    }
    void printArr(int[]arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class Question_10 {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,0};
        Solution s = new Solution();
        s.PushAllZeroTOEnd(arr);
        s.printArr(arr);

    }
}
