package Arrays;

public class class_2_implementArrays {
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 9;
        arr[1] = 8;
        arr[2] = 7;
        arr[3] = 4;
        int size = 0;

        // Print the Array

        for (int i = 0; i < 4; i++){
            size++;
            System.out.print(arr[i]+" ");
        }
        System.out.println(size);

    }
}
