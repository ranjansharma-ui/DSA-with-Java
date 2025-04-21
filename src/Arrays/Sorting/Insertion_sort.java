package Arrays.Sorting;

import static Arrays.Sorting.Bubble_sort.PrintArray;

public class Insertion_sort {
    static void InsertionSort(int arr[]){
     int n = arr.length;

     for(int i=1; i<n; i++){
         int key = i;
         while(key>0 && arr[key] < arr[key-1]){
             int temp = arr[key];
             arr[key] = arr[key-1];
             arr[key-1] = temp;
             key--;
         }
     }
    }
    public static void main(String[] args) {
        int arr[] = {5,6,3,2,9,1};
        InsertionSort(arr);
        PrintArray(arr);
    }
}
/*
Insertion Sort

Best Case: O(n) (when the array is already sorted)

Average Case: O(n²)

Worst Case: O(n²)
 */