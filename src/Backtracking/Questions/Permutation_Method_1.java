package Backtracking.Questions;

import java.util.ArrayList;
import java.util.List;

public class Permutation_Method_1 {
    public static void helper(int[] nums,List<Integer> ds,boolean[] isValid, List<List<Integer>> ans){
        int n = nums.length;
        if (ds.size() == n){
            List<Integer> list = new ArrayList<>();
            for (int i=0; i<ds.size(); i++){
                list.add(ds.get(i));
            }
            ans.add(list);
            return;
        }

        for (int i=0; i<nums.length; i++){
            if(isValid[i]==false){
                ds.add(nums[i]);
                isValid[i] = true;
                helper(nums,ds,isValid,ans);
                isValid[i] = false;
                ds.remove(ds.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>(); //mandatory
        List<Integer> ds = new ArrayList<>();//O(n)
        boolean []isvalid = new boolean[nums.length]; //O(n)
        helper(nums,ds,isvalid,ans);
        System.out.println(ans);

    }
}
