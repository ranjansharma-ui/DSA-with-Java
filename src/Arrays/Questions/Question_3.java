// count the number of occurrence of a particular element x

package Arrays.Questions;

public class Question_3 {
    public static int countoccurr(int arr[],int x){
        int count = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] ={5,6,1,5};
        int ans = countoccurr(arr,5);
        System.out.println(ans);

    }

}
