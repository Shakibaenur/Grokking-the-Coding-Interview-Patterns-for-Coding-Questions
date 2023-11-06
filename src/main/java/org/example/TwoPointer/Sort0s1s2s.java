package org.example.TwoPointer;

public class Sort0s1s2s {
    /*Given an array nums with n objects colored red, white, or blue,
    sort them in-place so that objects of the same color are adjacent,
    with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

*/
    public void sortColors(int[] nums) {
        //As there are only 3 elements so we can take 3 conuter variable
        int count0=0;
        int count1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                count0++;
            else if(nums[i]==1)
                count1++;
        }
        //here the loop will start from 0  index and iterate till count0
        for(int i =0;i<count0;i++)
            nums[i]=0;
        //here the loop will start from count0 because we have already set 0 till count0+count1
        for(int i=count0;i<count0+count1;i++)
            nums[i]=1;
        //and the last loop will iterate from count0+count1 till array length
        for(int i=count0+count1;i<nums.length;i++)
            nums[i]=2;
        //T.C: O(N)+O(N) First O(N) for counting the number of 0’s, 1’s, 2’s, and second O(N) for placing them correctly in the original array.

        // S.C: O(1) as we have not use any other array or data structure
    }


        public void sortColors1(int[] nums) {
            // //As there are only 3 elements so we can take 3 conuter variable
            // int count0=0;
            // int count1=0;
            // for(int i=0;i<nums.length;i++){
            //     if(nums[i]==0)
            //     count0++;
            //     else if(nums[i]==1)
            //     count1++;
            // }
            // //here the loop will start from 0  index and iterate till count0
            // for(int i =0;i<count0;i++)
            // nums[i]=0;
            // //here the loop will start from count0 because we have already set 0 till count0+count1
            // for(int i=count0;i<count0+count1;i++)
            // nums[i]=1;
            // //and the last loop will iterate from count0+count1 till array length
            // for(int i=count0+count1;i<nums.length;i++)
            // nums[i]=2;
            // //T.C: O(N)+O(N) First O(N) for counting the number of 0’s, 1’s, 2’s, and second O(N) for placing them correctly in the original array.

            // // S.C: O(1) as we have not use any other array or data structure


            //Optimal approach we will use Dutch Flag Algorithm

            int n=nums.length;
            int low=0;// starting of the array
            int mid=0;// starting of the array
            int high=n-1;// end of the array
            while(mid<=high){
                if(nums[mid]==0){
                    int temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    low++;
                    mid++;
                }else if(nums[mid]==1){
                    mid++;
                }else{
                    int temp=nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=temp;
//                    mid++;  //[1, 0, 2, 1, 0]
                    high--;

                }
            }
            //T.C: O(N)
            //S.C: O(1)

        }

}
