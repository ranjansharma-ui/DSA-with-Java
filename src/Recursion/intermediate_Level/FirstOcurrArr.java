package Recursion.intermediate_Level;

public class FirstOcurrArr {
    static int firstOcurr(int[] arr, int key,int idx){
        if (idx == arr.length) return -1;

        if (key == arr[idx]){
            return idx;
        }
        return firstOcurr(arr,key,idx+1);



    }
    public static void main(String[] args) {
        int []arr = {8,3,6,9,15,10,2,5,3};
        System.out.println(firstOcurr(arr,5,0));
    }
}
