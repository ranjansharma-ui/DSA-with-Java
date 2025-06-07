package Backtracking.Questions;

import java.util.ArrayList;

import java.util.List;

public class Permutation_Method_2_optimed {
    public static void helper(int nums[], int idx, List<List<Integer>> ans){
        int n = nums.length;

        //base case
        if (idx == n-1){
            List<Integer> l = new ArrayList<>();
            for(int i=0; i<n; i++){
                l.add(nums[i]);
            }
            ans.add(l);
            return;
        }

        for (int i=idx; i<n; i++){
            Swap(i,idx,nums);
            helper(nums,idx+1,ans);
            Swap(i,idx,nums);
        }
    }

    private static void Swap(int i, int idx, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,ans);
        System.out.println(ans);

    }
}
