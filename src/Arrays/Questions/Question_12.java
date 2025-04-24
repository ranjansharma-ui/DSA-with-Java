package Arrays.Questions;
// using extra space with using this approach.
public class Question_12 {
    public static void RotateArr(int[] arr,int[] arr_2, int k){
        int n = arr.length;
        k = k%n;


        int idx = 0;
        for (int i=n-k; i<n; i++){

            arr_2[idx] = arr[i];
            idx = idx+1;


        }
        for (int i=0; i<=n-k-1; i++){
            arr_2[idx] = arr[i];
            idx++;
        }
    }

   public static void PrintArray(int arr_2[]){
        for(int i=0; i<arr_2.length; i++){
            System.out.print(arr_2[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int[] arr_2 = new int[5];
        RotateArr(arr,arr_2,3);
        PrintArray(arr_2);

    }
}
