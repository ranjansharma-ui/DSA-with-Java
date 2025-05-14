package Arrays.InterviewQuestion_Leetcode_GFG;

public class Next_Permutation {
    public static void reverseArr(int arr[],int left,int right){
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    public static void PrintArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void NextPermutation(int[]arr){
        int n = arr.length;
        int ind = -1;
        for (int i = n-1; i>= 0; i--){
            if (arr[i] > arr[i-1]){
                ind = i;
                break;
            }
        }

        for (int i=n-1; i>=ind-1; i--){
            if (arr[i] > arr[ind-1]){
                int temp = arr[i];
                arr[i] = arr[ind-1];
                arr[ind-1] = temp;
                break;
            }
        }

        reverseArr(arr,ind,n-1);

    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,4,3,0,0};
        NextPermutation(arr);
        PrintArr(arr);
    }
}
