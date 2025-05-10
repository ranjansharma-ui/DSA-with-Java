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
    //when arr is already sorted
    static void OptimizeBubble(int[]arr){
        int n = arr.length;

        for (int i=0; i<n-1; i++){
            boolean flag = false; // has any swapping happened
            for (int j=0; j<n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true; // some swap has happened
                }
            }
            if (!flag){
                System.out.println("It's already sorted!");
                return;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

//        BubbleSort(arr);
        OptimizeBubble(arr);
        PrintArray(arr);
    }
}

/*
Bubble Sort

Best Case: O(n) (when the array is already sorted)

Average Case: O(n²)

Worst Case: O(n²)
 */
