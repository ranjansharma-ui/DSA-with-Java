package Arrays;

public class max {
    public static void main(String[] args) {
        int arr[] = {1,4,6,7,9};

        int min = 0;

        for(int i=1; i<=arr.length-1; i++){
            if(arr[i]<=arr[i-1]){
                min = arr[i];
            }

        }
        System.out.println(min);

    }



}
