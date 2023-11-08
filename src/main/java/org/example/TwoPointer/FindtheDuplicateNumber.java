package org.example.TwoPointer;

import java.util.Arrays;
import java.util.HashSet;

public class FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int index=1;
        int n=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]){
                n= nums[i+1];
            }
        }
        return n;
    }
    //T.C: O(NLogN+N)=O(NlogN)
    //S.C: O(1)

    public int findDuplicate1(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return nums[i];
            }
        }
        return 0;
    }
    //T.C: O(N)
    //S.C: O(N)

}
