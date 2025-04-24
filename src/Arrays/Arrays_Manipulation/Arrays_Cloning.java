package Arrays.Arrays_Manipulation;

public class Arrays_Cloning {
    static void PrintingArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,6};
        int arr_2[] = arr;  // same address

        int arr_3[] = arr.clone();  // New Address , Original array never change when are changed copy array

        arr_3[2] = 0;
        PrintingArray(arr_3);
        System.out.println();
        PrintingArray(arr);



        // similar methode like 1> Arrays.copyof(arr,arr.length)
        //                       2> Arrays.copyOfRange(arr,1,4)






    }
}
