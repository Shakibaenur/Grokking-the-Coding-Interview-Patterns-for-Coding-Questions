package org.example.WarmUp;

public class Findsqrt {

    class Solution {
        public int mySqrt(int x) {
            //We will use binary search here
            if(x<2)
                return x;//if x is 0 or 1 then sqrt will 0 /1
            //So we will start the left from 2
            int left=2;
            int right=x/2;
            long num=0;
            int pivot=0;//this is for finding the mid point
            while(left<=right){
                pivot= left+(right-left)/2;
                num=(long)pivot*pivot;//calculating the sqr of pivot
                if(num>x){
                    right=pivot-1;//as sqr is greater than my right so we will not consider the numbers after right
                }else if(num<x){
                    left=pivot+1;//as sqr is greater than my right so we will not consider the numbers before left
                }else{
                    return pivot;
                }
            }

            return right;//sometimes my mid point also can be the answer
        }
    }
    //T.C:O(LogN)// binary search time complexity is LogN
    //S.C: O(1)// as we did not use any other data structure

}
