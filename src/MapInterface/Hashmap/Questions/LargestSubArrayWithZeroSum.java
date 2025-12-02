package MapInterface.Hashmap.Questions;

import java.util.HashMap;

public class LargestSubArrayWithZeroSum {
    public static int Solution(int[] arr){
        int maxLength = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        mp.put(arr[0],0);
        int prefixSum = arr[0];
        for (int i=1; i<arr.length; i++){
            prefixSum = prefixSum + arr[i];
            if (mp.containsKey(prefixSum)){
                maxLength = i- mp.get(prefixSum);
            }else{
                mp.put(prefixSum,i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10,-25};
        System.out.println(Solution(arr));

    }
}
