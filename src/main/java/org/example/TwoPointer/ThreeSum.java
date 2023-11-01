package org.example.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

    //Brute Force solution
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            int n=nums.length;
            HashSet<List<Integer>> set=new HashSet<>();

            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    for(int k=j+1;k<n;k++){
                        if(nums[i]+nums[j]+nums[k]==0){
                            List<Integer> temp= Arrays.asList(nums[i],nums[j],nums[k]);
                            temp.sort(null);
                            set.add(temp);
                        }
                    }
                }
            }
            List<List<Integer>> ans=new ArrayList<>(set);
            return ans;
        }
    }

    //T.C: O(N^3)
    //S.C: O(N)// as i have used hash map as well


    //Better approach hasshing

    class Solution2 {
        public List<List<Integer>> threeSum(int[] nums) {
            int n=nums.length;
            HashSet<List<Integer>> set=new HashSet<>();
            for(int i=0;i<n;i++){
                HashSet<Integer> temp=new HashSet<>();
                for(int j=i+1;j<n;j++){
                    int third=-(nums[i]+nums[j]);
                    if(temp.contains(third)){
                        List<Integer> list=Arrays.asList(nums[i],nums[j],third);
                        list.sort(null);
                        set.add(list);
                    }
                    temp.add(nums[j]);
                }
            }

            List<List<Integer>> answer=new ArrayList<>(set);
            return answer;

        }
    }
    //T.C:O(N2 * log(no. of unique triplets)), where N = size of the array.
    //S.C: O(2 * no. of the unique triplets) + O(N) as we are using a set data structure and a
    // list to store the triplets and extra O(N) for storing the array elements in another set.
}
