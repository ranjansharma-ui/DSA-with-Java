package Linked_List.Questions;

import java.util.ArrayList;

public class FirstLast {
    public static ArrayList<Integer> result(ArrayList<Integer> arr,int key){
        int left = 0;
        int right = arr.size()-1;
        ArrayList<Integer> ans = new ArrayList<>();


        while (left < right){

            int mid = (left + right)/2;

            if (arr.get(right) == key && arr.get(left) == key){
                ans.add(left);
                ans.add(right);
                return ans;
            }

            if (arr.get(mid) == key && arr.get(left) < arr.get(mid)){

                left++;

            }
            if (arr.get(mid) == key && arr.get(right) > arr.get(mid)) {
                right--;
            }

            if (arr.get(left) != key && arr.get(right) != key){
                left++;
                right--;
            }
        }
        if (ans.size() == 0){
            ans.add(-1);
            ans.add(-1);
        }else {

          return ans;
        }

        return ans;

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(67);
        arr.add(123);
        arr.add(125);

        System.out.println(result(arr,7));



    }
}
