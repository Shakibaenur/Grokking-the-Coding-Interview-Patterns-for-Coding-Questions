package org.example.TwoPointer;

import java.util.Arrays;

public class FindSmallerTriplets {
    public static int searchTriplets(int[] arr, int target) {
        int count = 0;
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum=arr[i]+arr[l]+arr[r];
                if(sum<target){
                    // If the sum is less than the target, all the triplets between left and right are valid.
                    count += r - l;
                    l++;
                }else{
                    r--;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(
                searchTriplets(new int[] { -1, 4, 2, 1, 3 }, 5));
    }
}
//T.C: O(N^2)
//S.C: O(1)
