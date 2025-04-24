package Arrays.Arrays_Manipulation;

public class Arrays_ReferenceCopy {

    static void PrintingArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
    }


    public static void main(String[] args) {
        int[] arr = {5,3,2,1,6};
        System.out.println("Oringinal Array");
        PrintingArray(arr);
        System.out.println();
        // copy referance
        int[] arr_2 = arr;
        System.out.println("Copy Array");
        PrintingArray(arr_2);


        // Change some value
        arr_2[0] = 1;
        System.out.println("\nOriginal array after change");
        PrintingArray(arr);
    }
}
