package Arrays.Questions;

// Next permutation find .... GeekforGeek

public class Question_13 {
    public static void SwapTheNumber(int num1, int num2){
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;

    }
    public static void revese(int[] arr, int left, int right){
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void NextPermutaion(int[] arr){
        int n = arr.length;
        int ind = -1;

        for (int i=n-2; i>=0; i--){
            if (arr[i] < arr[i+1]){
                ind = i;
                break;
            }
        }

        if (ind == -1){
            revese(arr,0,n-1);
            return;

        }

        for (int i=n-1; i>=ind; i--){
            if (arr[i] > arr[ind]){
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                break;
            }
        }

        revese(arr,ind+1,n-1);



    }

    public static void main(String[] args) {

        int arr[] = {2,4,1,7,5,0};
        NextPermutaion(arr);

        for (int num:arr){
            System.out.print(num+" ");
        }


    }
}
