package Arrays;
//find the last occurrence of an element x in a given array
public class Question_4 {
    static int lastOccurr(int arr[],int x){
        int idx = -1;

        for(int i=0; i<arr.length; i++){
            if (arr[i] == x){
                idx = i;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,3,5,6};
        int ans = lastOccurr(arr,5);

        System.out.println(ans);
    }
}
