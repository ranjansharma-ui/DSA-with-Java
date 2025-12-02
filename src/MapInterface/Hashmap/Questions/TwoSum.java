package MapInterface.Hashmap.Questions;

import java.util.HashMap;

public class TwoSum {
    public static int[] solution(int[]arr,int target){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[]ans = {-1};
        for (int i=0; i<arr.length; i++){
            int needVal = target-arr[i];
            if (mp.containsKey(needVal)){
                ans = new int[]{i,mp.get(needVal)};
                return ans;
            }else {
                mp.put(arr[i],i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,4,7,6,1};
        int target = 11;
        System.out.println(solution(arr,11));
    }
}
