package Arrays.Sorting;

import static Arrays.Sorting.Bubble_sort.PrintArray;

public class Selection_sort {

    static void SelectionSort(int arr[]){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int min_idx = i;

            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            //swap

            if(arr[i] > arr[min_idx]){
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,5,6,1};

        SelectionSort(arr);
        PrintArray(arr);
    }
}

/*
   Selection Sort

Best Case: O(n²)

Average Case: O(n²)

Worst Case: O(n²)
 */
