package MapInterface.Hashmap.Questions;

import java.util.HashMap;

public class pairSumMax {
    static int mp(int[]arr ,int target){
        HashMap<Integer,Integer> mpFreq = new HashMap<>();
        int max = 0;

        for (int i=0; i< arr.length; i++){
            if (mpFreq.containsKey(target-arr[i])) {
                max += mpFreq.get(target-arr[i]);
            }
            mpFreq.put(arr[i],mpFreq.getOrDefault(arr[i],0) + 1);
        }
        return max;
    }


    public static void main(String[] args) {

        int[] arr = {1,1,1,1};
        System.out.println(mp(arr,2));





    }
}
