package Divide_Conquer;

public class QuickSort {
    public static void printArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int arr[], int si, int ei){
        //base-case
        if(si >= ei){
            return;
        }

        int pIdx = partition(arr,si,ei);
        quickSort(arr,si,pIdx-1);
        quickSort(arr,pIdx+1,ei);

    }
    public static int partition(int arr[], int si, int ei){
        int i = si-1;
        int Pivot = arr[ei];

        for (int j = si; j<arr.length; j++){
            if (arr[j] < Pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = Pivot;
        arr[ei] = arr[i];
        arr[i] = Pivot;

        return i;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,2,6,1,9,7};
        quickSort(arr,0,arr.length-1);
        printArr(arr);

    }
}
