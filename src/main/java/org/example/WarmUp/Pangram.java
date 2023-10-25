package org.example.WarmUp;

import java.util.HashSet;

//A pangram is a sentence where every letter of the English alphabet appears at least once.
public class Pangram {
    class Solution {
        public boolean checkIfPangram(String sentence) {
            // TODO: Write your code here
            HashSet<Character> set=new HashSet<>();
            for(char ch: sentence.toLowerCase().toCharArray()){
                if(Character.isLetter(ch)){
                    set.add(ch);
                }
            }
            if(set.size()==26)
                return true;
            return false;
        }
    }
}
//T.C: O(N)
//S.C: O(1)
