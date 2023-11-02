package org.example.TwoPointer;

import java.util.ArrayList;
import java.util.List;

//Two Pointer with Sliding Window
public class SubArrayWithProductLessThanTarget {
    public static List<List<Integer>> findSubarrays(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int left=0;
        double product=1;
        int count=0;
        for(int right=0;right<arr.length;right++){
            product*=arr[right];

            while (product>=target && left<right){
                product/=arr[left];
                left++;
            }
            if(product<target){
                List<Integer> temp=new ArrayList<>();
                for(int i=right; i>=left;i--){
                    count++;
                    temp.add(arr[i]);
                    System.out.println("i "+i +" arr i: "+ arr[i]+" product: "+product+ " temp: "+temp);
                    result.add(new ArrayList<>(temp));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findSubarrays(new int[] { 2, 5, 3, 10 }, 30));
    }
}


//T.C: The main for-loop managing the sliding window takes  but creating subarrays can take up to  in the worst case. Therefore overall, our algorithm will take .
//S.C:Space Complexity
//Ignoring the space required for the output list, the algorithm runs in  space which is used for the temp list.
//
//Can you try estimating how much space will be required for the output list?
//
//   n + (n-1) + (n-2) + ... 3 + 2 + 1
//The worst-case will happen when every subarray has a product less than the target!
//
//So the question will be, how many contiguous subarrays an array can have?
//It is definitely not all Permutations of the given array; is it all Combinations of the given array?
//
//It is not all the Combinations of all elements of the array!
//
//For an array with distinct elements, finding all of its contiguous subarrays is like finding the number of ways to choose two indices, i and j, in the array such that i <= j.
//
//If there are a total of n elements in the array, here is how we can count all the contiguous subarrays:
//
//When i = 0, j can have any value from 0 to n-1, giving a total of n choices.
//When i = 1, j can have any value from 1 to n-1, giving a total of n-1 choices.
//Similarly, when i = 2, j can have n-2 choices. … …
//When i = n-1, j can only have only 1 choice.
//Let’s combine all the choices:
//
//Which gives us a total of: .
//
//So, at most, we need space for  output lists. At worst, each subarray can take  space, so overall, our algorithm’s space complexity will be .