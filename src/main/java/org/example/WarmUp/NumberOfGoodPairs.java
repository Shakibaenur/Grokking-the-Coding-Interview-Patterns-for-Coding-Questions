package org.example.WarmUp;

import java.util.HashMap;

public class NumberOfGoodPairs {
    class Solution {

        public int numIdenticalPairs(int[] nums) {
            int pairCount=0;
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int n:nums){
                //put the number as key and the frequency as value
                map.put(n,map.getOrDefault(n,0)+1);
                pairCount+=map.get(n)-1;// the number of pair will be less than of its occurance
            }
            return pairCount;
        }
    }
}
