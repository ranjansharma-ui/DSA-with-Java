// calculate the maximum value out of all the elements in the array.
//intput : [1,2,3,4,2,4]
// output : 4



package Arrays.Questions;

public class Question_1 {
    public static int Max(int arr[]){
        int ans = 0;

        for (int i=0; i<arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,4};
        int result = Max(arr);
        System.out.println(result);

    }
}
