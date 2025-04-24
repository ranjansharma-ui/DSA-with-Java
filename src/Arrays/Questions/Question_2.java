// Search the Given elements X in the array if Present then return the index else return -1;

// input : [1,5,6,7,4] , X = 6
// output : 2

package Arrays.Questions;

public class Question_2 {
    static int SearchElement(int[] arr,int X){

        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i] == X){
                return i;

            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr[] = {1,5,6,7,4};
        int X = 0;

        int result = SearchElement(arr,X);
        System.out.println(result);

    }
}
