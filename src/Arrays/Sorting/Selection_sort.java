package Arrays.Sorting;

import static Arrays.Sorting.Bubble_sort.PrintArray;

public class Selection_sort {

    static void SelectionSort(int arr[]){
        int n = arr.length;

        for (int i=0; i<n; i++){
            int min_idx = i;
            for (int j=i+1; j<n; j++){
                if (arr[min_idx] > arr[j]){
                    min_idx = j;
                }
            }
            //swap
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

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
