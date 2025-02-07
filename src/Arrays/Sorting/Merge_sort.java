package Arrays.Sorting;

import static Arrays.Sorting.Bubble_sort.PrintArray;

public class Merge_sort {



    static void MergeSort(int arr[],int l,int r){
        if(l >= r) return;
        int mid = (l+r)/2;
        MergeSort(arr,l,mid);
        MergeSort(arr,mid+1,r);

        Merge(arr,l,mid,r);

    }

    static void Merge(int arr[], int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        int i,j,k;

        for(i=0; i<n1; i++){
            left[i] = arr[l+i];
        }
        for (j=0; j<n2; j++){
            right[j] = arr[mid+1+j];
        }
        i =  0;
        j = 0;
        k = l;

        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                k++;
                i++;
            }else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }

        while (i<n1){
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k] = right[j];
            k++;
            j++;
        }

    }



    public static void main(String[] args) {
        int arr[] = {5,8,1,2,3,24,8,12};
        int l = 0;
        int r = arr.length-1;
        MergeSort(arr,l,r);
        PrintArray(arr);



        /*
           The time complexity of Merge Sort is as follows:

           Best Case: O(n log n)

           Average Case: O(n log n)

           Worst Case: O(n log n)
         */


    }
}
