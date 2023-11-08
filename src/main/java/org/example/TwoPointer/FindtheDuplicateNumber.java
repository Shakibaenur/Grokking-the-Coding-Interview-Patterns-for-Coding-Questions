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


    public int findDuplicate2(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            int correctPosition= nums[i]-1;
            if(nums[i]!=i+1){
                if(nums[correctPosition]!=nums[i]){
                    int temp=nums[i];
                    nums[i]=nums[correctPosition];
                    nums[correctPosition]=temp;
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return 0;
    }
    //T.C: O(N)
    //S.C: O(1))
}
