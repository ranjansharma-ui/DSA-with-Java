package Arrays.Arrays_Manipulation;

/*
   imp:
      Integer.MIN_VALUE = -21474833648
      Integer.MAX_VALUE = 2147483647




    Q.find the second largest elements in the given arrays
    input : [9,8,9,6,9,5,8]
    output : 8

    int max = 9
    Second max = 8

 */

public class Question_11 {
    static int Findmax(int[]arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];

            }
        }
        return max;
    }
    //second largest

    static int secondElement(int[] arr){
        int n= arr.length;
        int mx = Findmax(arr);

        for (int i=0; i<n; i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = Findmax(arr);
        return secondMax;
    }


    public static void main(String[] args) {

    int arr[] = {9, 8, 9, 6, 9, 5, 8};

    int result = secondElement(arr);
        System.out.println("Second-Max : "+ secondElement(arr));


    }
}
