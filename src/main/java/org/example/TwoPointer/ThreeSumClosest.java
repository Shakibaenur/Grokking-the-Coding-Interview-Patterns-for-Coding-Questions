package org.example.TwoPointer;

import java.util.Arrays;

public class ThreeSumClosest {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int closetSum=nums[0]+nums[1]+nums[2];
            int n=nums.length;
            //n-2 because we will calculate after 2 index while iterating
            for(int i=0;i<n-2;i++){
                int l=i+1;
                int r=n-1;

                while(l<r){
                    int sum=nums[i]+nums[l]+nums[r];
                    if(Math.abs(target-sum)<Math.abs(target-closetSum)){
                        closetSum=sum;
                    }
                    if(sum<target){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
            return closetSum;
        }
    }
    //T.C: O(N^2)
    //S.C: O(1)
}
