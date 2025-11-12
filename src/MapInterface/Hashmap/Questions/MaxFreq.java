package MapInterface.Hashmap.Questions;

import java.util.*;

public class MaxFreq {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,1,4,4,6,4,4,4};
        Map<Integer,Integer> freq = new HashMap<>();
        for(int el: arr){
            if (!freq.containsKey(el)){
                freq.put(el,1);
            }else{
                freq.put(el,freq.get(el) + 1);
            }
        }

        System.out.println("frequency");
        System.out.println(freq.entrySet());

        int mxFreq = 0, ansKey = -1;
//        for (var e : freq.entrySet()){
//            if (e.getValue() > mxFreq){
//                mxFreq = e.getValue();
//
//                ansKey = e.getKey();
//            }
//        }

        for (var key : freq.keySet()){
            if (freq.get(key) > mxFreq){
                mxFreq = freq.get(key);
                ansKey = key;
            }
        }

        System.out.printf("%d has max frequency ans it occurs %d times", ansKey,mxFreq);
    }
}
