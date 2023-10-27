package org.example.WarmUp;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

    //Using HashSet
    public boolean containsDuplicate1(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(set.size()!=nums.length)
            return true;
        return false;
    }
    //T.C: O(N)
    //S.C: O(N)

    //Using Sort
    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }

        return false;
    }
    //T.C: O(NLogN) // sort has logn and the loop N
    //S.C: O(1) as we did not use any extra Data Structure

    //Using Brute Force
    public boolean containsDuplicate3(int[] nums) {

        for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[j]==nums[i]){
                   return true;
               }
           }
        }

        return false;
    }

    //T.C: O(N^2) // As two loops has been used
    //S.C: O(1) as we did not use any extra Data Structure
}
