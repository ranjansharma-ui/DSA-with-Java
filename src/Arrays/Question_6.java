package Arrays;
// check if the given array is sorted or not
public class Question_6 {
    static boolean Checking(int arr[]){
        for (int i=0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                return  false;

            }


        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,7,4,9};
        boolean ans = Checking(arr);
        System.out.println(ans);
    }

}
