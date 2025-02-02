package Arrays;
//Q. count the number of elments strictly greater than value x,return index and value
public class Question_5 {
    static int StrictlyEle(int arr[],int x){
        int idx = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]-1 == x){
                System.out.println("value : "+arr[i]);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,3,5,6,7,2};
        int ans = StrictlyEle(arr,5);
        System.out.println("idx : "+ans);

    }
}
