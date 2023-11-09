package org.example.dp;

public class StaireCount {
    class Solution {
        public int climbStairs(int n) {
            int oneWay=1;
            int twoWay=1;
            for(int i=0;i<n-1;i++){
                int temp=oneWay;
                oneWay=oneWay+twoWay;
                twoWay=temp;
            }
            return oneWay;

        }
    }
//T.C: O(N)
//T.C: O(1)
}
