package org.example.WarmUp;

public class ShortestWordDistance {
    class Solution {
        public int shortestDistance(String[] words, String word1, String word2) {
            // TODO: Write your code here
            int w1Index=-1;
            int w2Index=-1;
            int distance=words.length;
            for(int i=0;i<words.length;i++){
                String word=words[i];
                if(word.equals(word1)){
                    w1Index=i;
                }else if(word.equals(word2)){
                    w2Index=i;
                }
                if(w1Index!=-1 && w2Index!=-1)
                {
                    distance=Math.min(distance, Math.abs(w1Index-w2Index));
                }
            }
            return distance;
        }
    }

}
//T.C: O(N)
//S.C: O(1)
