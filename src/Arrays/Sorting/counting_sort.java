package Arrays.Sorting;

import static Arrays.Sorting.Bubble_sort.PrintArray;

public class counting_sort {
    public static void countingSort(int[]arr){
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            largest = Math.max(largest,arr[i]);
        }

        int[]count = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for (int i=0; i<count.length; i++){
            while (count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,1,1,2,3,5,7};
        countingSort(arr);
        PrintArray(arr);
    }
}
