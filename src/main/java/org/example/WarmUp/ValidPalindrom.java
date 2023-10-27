package org.example.WarmUp;

public class ValidPalindrom {
    class Solution {
        public boolean isPalindrome(String s) {
            if(s.isEmpty())
                return true;
            char[] arr=s.toCharArray();
            int left=0;
            int right=arr.length-1;
            while(left<=right){
                if(!Character.isLetterOrDigit(left)){
                    left++;
                }else if(!Character.isLetterOrDigit(right)){
                    right--;
                }else{
                    if(Character.toLowerCase(arr[left])!=Character.toLowerCase(arr[right])){
                        return false;
                    }

                    left++;
                    right--;
                }
            }
            return true;
        }
    }
}
