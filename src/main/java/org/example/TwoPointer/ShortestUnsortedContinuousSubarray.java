package org.example.TwoPointer;

public class ShortestUnsortedContinuousSubarray {
    public static int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<n-1 && nums[left]<=nums[left+1] )
            left++;//find the left most index which is out of sorting order
        while(right>0 && nums[right]>=nums[right-1])
            right--;//find the right most sorting index which is out of sorting order
        if(left>=right)
            return 0;// means the array is already sorted
        //Now find the minimum number and the maximum number in the subarray
        // [1, 3, 2, 0, -1, 7, 10]
        int maximumNumber=Integer.MIN_VALUE;
        int minimumNumber=Integer.MAX_VALUE;
        for(int i =left;i<=right;i++){
            maximumNumber=Math.max(maximumNumber,nums[i]);
            minimumNumber=Math.min(minimumNumber,nums[i]);
        }
        //expand the subArray to include the elements needs to be sorted
        while(left>0 && nums[left-1]>minimumNumber)
            left--;
        while(right<n-1 && nums[right+1]<maximumNumber)
            right++;

        return right-left+1;
    }
    public static void main(String[] args) {
        System.out.println(findUnsortedSubarray(new int[] { 1,3,2,2,2}));
//        System.out.println(findUnsortedSubarray(new int[] { 1, 3, 2, 0, -1, 7, 10 }));
//        System.out.println(findUnsortedSubarray(new int[] { 1, 2, 3 }));
//        System.out.println(findUnsortedSubarray(new int[] { 3, 2, 1 }));
    }
}
//T.C: O(N)
//S.C: O(1)
