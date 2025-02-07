package Arrays.Sorting;

import java.util.Arrays;

import static Arrays.Sorting.Bubble_sort.PrintArray;

public class Quick_sort {
    static void QuickSort(int arr[], int st, int end){
        if(st >= end) return;
        else {
            int r = partition(arr,st,end);
            QuickSort(arr,st,r-1);
            QuickSort(arr,r+1,end);

        }

    }
    static int partition(int arr[],int st, int end){
        int x = arr[st];
        int p = st;

        for(int q = st+1; q<=end; q++){
            if(arr[q] <= x){
                p = p+1;
                int temp = arr[p];
                arr[p] = arr[q];
                arr[q] = temp;
            }

        }
        int temp2 = arr[st];
        arr[st] = arr[p];
        arr[p] = temp2;
        return p;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,9,5,1,8};
        QuickSort(arr,0,arr.length-1);
        PrintArray(arr);

    }
}

/*
The time complexity of Quick Sort is as follows:

Best Case: O(n log n)

Average Case: O(n log n)

Worst Case: O(n²)
 */
