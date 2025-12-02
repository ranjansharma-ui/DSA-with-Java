package MapInterface.HashSet.Questions;

import java.util.HashSet;

public class LongestConsecutiveElement {
    public int Solution(int[]arr){
        //Hashset
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr) set.add(i);
        int maxCon = 0;

        for (Integer num : set){
            if (!set.contains(num-1)){ // it's means this is staring point
                int currNum = num; // check number continuously
                int currCon = 1;
                while(set.contains(currNum+1)){
                    currCon++;
                    currNum++; // tracking consecutive elements
                }
                maxCon = Math.max(maxCon,currCon);
            }
        }

        return maxCon;
    }
}
