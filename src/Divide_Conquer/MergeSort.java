package Divide_Conquer;

public class MergeSort {
    public static void PrintArr(int arr[]){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void mergeSort(int arr[],int si, int ei){
        //base-case
        if (si >= ei){
            return;
        }

        int mid = si+(ei-si)/2;
        mergeSort(arr,si,mid); // left part
        mergeSort(arr,mid+1,ei); // right part

        merge(arr,si, mid, ei);



    }
    public static void merge(int arr[],int si,int mid, int ei){
        int temp[] = new int[ei-si+1];

        int i = si; // iterating for left part
        int j = mid+1; // iterating for right part
        int k = 0; // iterating for temp arr

        while (i <= mid && j <= ei ){
            if (arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;

        }

        //for remaining part of both side array like left and right
        while (i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        // copy from temp array to original array
        for (k=0,i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[] = {5,3,7,5,2,8,4};
        mergeSort(arr,0,arr.length-1);
        PrintArr(arr);




    }
}
