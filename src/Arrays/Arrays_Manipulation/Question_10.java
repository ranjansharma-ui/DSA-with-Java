package Arrays.Arrays_Manipulation;
/*
   find the unique number in a given Array where all the elements are being repeated twice with one value being unique

   input : [1,2,3,4,2,1,3]
   output: 4 because it's unique number in array
 */

public class Question_10 {

    static int FindUnique(int[]arr){
        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i] >0){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,1,3};
        int ans = FindUnique(arr);

        System.out.println("Unique element : "+ans);

    }

}
