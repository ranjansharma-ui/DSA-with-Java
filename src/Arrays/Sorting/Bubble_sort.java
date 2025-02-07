package Arrays.Sorting;

public class Bubble_sort {

    static void PrintArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void BubbleSort(int arr[]){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


    }
    public static void main(String[] args) {
        int arr[] = {7,5,3,2,1};

        BubbleSort(arr);
        PrintArray(arr);
    }
}

/*
Bubble Sort

Best Case: O(n) (when the array is already sorted)

Average Case: O(n²)

Worst Case: O(n²)
 */
