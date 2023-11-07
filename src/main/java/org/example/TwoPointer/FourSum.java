package org.example.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> searchQuadruplets(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1])
                    continue;
                int left=j+1;
                int right=n-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        List<Integer> tempList= Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
                        result.add(tempList);
                        left++;
                        right--;
                        while(left<right && nums[left]==nums[left-1]) left++;
                        while(left<right && nums[right]==nums[right+1]) right--;
                    }else if(sum<target){
                        left++;
                    }else{
                        right--;
                    }
                }

            }
        }
        return result;

    }
}

//T.C: Sorting the array will take O(N*LogN). Overall searchQuadruplets() will take O(N*logN +N^3), which is asymptotically equivalent to O(N^3).
//S.C: O(N) as we have used an extra array
