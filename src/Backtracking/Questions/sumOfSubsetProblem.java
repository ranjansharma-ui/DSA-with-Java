package Backtracking.Questions;

import java.util.ArrayList;
import java.util.List;

public class sumOfSubsetProblem {
    public static void FindSubset(int []set, int targetSum){
        List<Integer> currSubset = new ArrayList<>();

        backtracking(set,currSubset,0,0,targetSum);

    }

    public static void backtracking(int[]set, List<Integer> currSubset,int currIdx,int currSum, int targetSum ){
        //base-case-1
        if (targetSum == currSum){
            System.out.println(currSubset);
            return;
        }

        //base-case-2
        if (currSum > targetSum || currIdx == set.length){
            return;
        }

        //Recursive-1 (Include)
        currSubset.add(set[currIdx]); // include set[0] portion
        backtracking(set,currSubset,currIdx+1,currSum+set[currIdx],targetSum);

        //backtracking
        currSubset.remove(currSubset.size()-1);


        //Recursive-2 (Exclude)
        backtracking(set,currSubset,currIdx+1,currSum,targetSum);

    }


    public static void main(String[] args) {
        int nums[] = {2,3,4,1,2};
        FindSubset(nums,5);

    }
}
