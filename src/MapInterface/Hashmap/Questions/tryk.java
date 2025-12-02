package MapInterface.Hashmap.Questions;

import java.util.ArrayList;
import java.util.HashMap;

public class tryk {
    public static ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num : arr){
            if(mp.containsKey(num)){
                int currValue = mp.get(num);
                mp.put(num,currValue+1);
            }else{
                mp.put(num,1);
            }
        }
        System.out.println(mp);

        int limit = arr.length/3;
        System.out.println(limit);
        ArrayList<Integer> ans = new ArrayList<>();

        for(var e : mp.entrySet()){
            if(limit < e.getValue()){
                ans.add(e.getKey());
            }
        }

        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {2,2,1,3,1,2,1};
        ArrayList<Integer> ans = findMajority(arr);
        System.out.println(ans);
    }
}
