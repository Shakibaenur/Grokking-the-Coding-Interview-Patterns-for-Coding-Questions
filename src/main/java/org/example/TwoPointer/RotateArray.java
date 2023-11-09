package org.example.TwoPointer;

public class RotateArray {
    class Solution {
        public void rotate(int[] nums, int k) {
            //1st reverse the array
            //reverse the array till k-1
            //reverse the array from k to nums.length-1
            //[1,2,3,4,5,6,7], k = 3
            // Ensure k is within array bounds
            k %= nums.length;
            reverseArray(nums,0,nums.length-1);//[7,6,5,4,3,2,1]
            reverseArray(nums,0,k-1);//[7,6,5,4,3,2,1]=>[5,6,7]+[4,3,2,1]=[5,6,7,4,3,2,1]
            reverseArray(nums,k,nums.length-1);//[5,6,7,4,3,2,1]=>[5,6,7]+[1,2,3,4]=[5,6,7,1,2,3,4]
        }
        private void reverseArray(int[] nums,int start,int end){
            while(start<end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
    }
    //Time complexity:
    //O(N)
    //Space complexity:
    //O(1)
}
