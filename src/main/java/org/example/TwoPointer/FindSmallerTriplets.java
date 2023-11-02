package org.example.TwoPointer;

import java.util.Arrays;

/*
Given an array arr of unsorted numbers and a target sum, count all
triplets in it such that arr[i] + arr[j] + arr[k] < target where i, j,
and k are three different indices. Write a function to return the count of such triplets.
Input: [-1, 4, 2, 1, 3], target=5
Output: 4
Explanation: There are four triplets whose sum is less than the target:
[-1, 1, 4], [-1, 1, 3], [-1, 1, 2], [-1, 2, 3]
Input: [-1, 0, 2, 3], target=3
Output: 2
Explanation: There are two triplets whose sum is less than the target: [-1, 0, 3], [-1, 0, 2]
 */
public class FindSmallerTriplets {
    public static int searchTriplets(int[] arr, int target) {
        int count = 0;
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum < target) {
                    // If the sum is less than the target, all the triplets between left and right are valid.
                    count += r - l;
                    //if extension required to find out all the triplets
//                    for (int k = l; k < r; k++) {
//                        System.out.println(arr[i] + ", " + arr[l] + ", " + arr[k]);
//                    }
                    l++;
                } else {
                    r--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(
                searchTriplets(new int[]{-1, 4, 2, 1, 3}, 5));
    }
}
//T.C: O(N^2)
//Sorting the array will take .
// The searchPair() will take . So, overall searchTriplets() will take ,
// which is asymptotically equivalent to
//The space complexity of the above algorithm will be
// which is required for sorting if we are not using an in-place sorting algorithm.
