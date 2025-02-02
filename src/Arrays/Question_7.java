package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

/*
   Q. => arr = [5,8,1,3,6,2]
         smallest = 1, largest = 8
         output = [1,8]
 */
public class Question_7 {
    public static void main(String[] args) {
        int arr[] = {5,8,1,3,6,2};
        Arrays.sort(arr);

        ArrayList<Integer> ans = new ArrayList<Integer>(5);
        ans.add(arr[0]);
        ans.add(arr[arr.length-1]);

        System.out.println(ans);


    }
}
