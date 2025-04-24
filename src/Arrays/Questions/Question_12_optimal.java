package Arrays.Questions;

public class Question_12_optimal {
    public static void reverseArr(int arr[],int left, int right){
//        int left = 0;
//        int right = arr.length-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

    }
    public static void RotateArray(int[]arr,int k){
        int n = arr.length;
        k = k%n;

        // Rotate-left (anti clock-wise)
//        reverseArr(arr,n-k,n-1);
//        reverseArr(arr,0,n-k-1);
//        reverseArr(arr,0,n-1);

        // Rotate-right (clock-wise)
        reverseArr(arr,0,k-1);
        reverseArr(arr,k,n-1);
        reverseArr(arr,0,n-1);






    }
    public static void PrintArray(int arr_2[]){
        for(int i=0; i<arr_2.length; i++){
            System.out.print(arr_2[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        RotateArray(arr,2);
        PrintArray(arr);
    }
}
