package org.example.WarmUp;

public class ReverseVowel {
    public class Solution {
        //First let's build a function which checks wheather a character is vowel or not

        public boolean isVowel(char ch){
            ch=Character.toLowerCase(ch);
            return ch =='a'|| ch =='e' || ch =='i' || ch=='o' || ch=='u';
        }
        public void swap(int left,int right, char[] ch){
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
        }
        public String reverseVowels(String s) {
            char[] arr=s.toCharArray();
            int left=0;
            int right=arr.length-1;
            while(left<=right){
                if(!isVowel(arr[left])){
                    left++;
                }else if(!isVowel(arr[right])){
                    right--;
                }else{
                    swap(left,right,arr);
                    left++;
                    right--;
                }
            }
            return new String(arr);
        }
    }

}
