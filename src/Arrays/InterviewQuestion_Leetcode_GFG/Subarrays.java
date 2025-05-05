package Arrays.InterviewQuestion_Leetcode_GFG;

public class Subarrays {

    public static void SumAllSubArrMinMax(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];


                }

                ans[i] = sum;
                sum = 0;
            }
        }
        System.out.print("Sum of Maximum SubArray: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void PrintSubArr(int[] arr) {
        int n = arr.length;
        int tsa = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print(" ");
                tsa++;
            }
            System.out.println();
        }
        System.out.println("Total SubArray : " + tsa);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        PrintSubArr(arr);
        SumAllSubArrMinMax(arr);
    }
}
