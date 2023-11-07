package org.example.TwoPointer;

import java.util.Stack;

public class StringCompare {
    /*Java Collection framework provides a Stack class that models and
     implements a Stack data structure. The class is based on the basic
      principle of last-in-first-out.*/
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> str1=new Stack<>();
        Stack<Character> str2=new Stack<>();
        for(char str: s.toCharArray()){
            if(str == '#'){
                if(!str1.isEmpty())
                    str1.pop();
            }else{
                str1.push(str);
            }
        }
        for(char str:t.toCharArray()){
            if(str=='#'){
                if(!str2.isEmpty())
                    str2.pop();
            }else
                str2.push(str);
        }
        StringBuilder res1=new StringBuilder();
        StringBuilder res2=new StringBuilder();

        while(!str1.isEmpty()){
            res1.append(str1.pop());
        }
        while(!str2.isEmpty()){
            res2.append(str2.pop());
        }
        return res1.toString().equals(res2.toString());
    }
    //T.C:  the time complexity of this code is O(max(N, M)).
    //S.C:  Overall, the space complexity of this code is O(max(N, M)) due to the stacks and StringBuilder objects.

    class Solution {
        public boolean backspaceCompare(String str1, String str2) {

            int index1 = str1.length() - 1, index2 = str2.length() - 1;
            while (index1 >= 0 || index2 >= 0) {

                int i1 = getNextValidCharIndex(str1, index1);
                int i2 = getNextValidCharIndex(str2, index2);

                if (i1 < 0 && i2 < 0) // reached the end of both the strings
                    return true;

                if (i1 < 0 || i2 < 0) // reached the end of one of the strings
                    return false;

                if (str1.charAt(i1) != str2.charAt(i2)) // check if the characters are equal
                    return false;

                index1 = i1 - 1;
                index2 = i2 - 1;
            }

            return true;
        }

        private static int getNextValidCharIndex(String str, int index) {
            int backspaceCount = 0;
            while (index >= 0) {
                if (str.charAt(index) == '#') // found a backspace character
                    backspaceCount++;
                else if (backspaceCount > 0) // a non-backspace character
                    backspaceCount--;
                else
                    break;

                index--; // skip a backspace or a valid character
            }
            return index;
        }

    }

}
