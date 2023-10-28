package org.example.WarmUp;

import java.util.HashMap;

public class Anagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if(s.length()!=t.length())
                return false;

            HashMap<Character,Integer> set=new HashMap<>();
            for(int i=0;i<s.length();i++){
                // Increment the frequency of the character in string s.
                set.put(s.charAt(i), set.getOrDefault(s.charAt(i),0)+1);
                // Decrement the frequency of the character in string t.
                set.put(t.charAt(i),set.getOrDefault(t.charAt(i),0)-1);
                //after this if the frequency of each character becomes 0 that means it is an anagram
            }

            for(char ch : set.keySet()){
                if(set.get(ch)!=0){
                    //after this if the frequency of each character becomes not 0 that means it is not an anagram
                    return false;
                }
            }

            return true;
        }
    }
}
