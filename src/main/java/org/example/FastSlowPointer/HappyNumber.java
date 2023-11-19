package org.example.FastSlowPointer;

import java.util.HashSet;

public class HappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=numberOfSquare(n);

        }
        return n==1;
    }
    private  static int numberOfSquare(int n){
        int sum=0,digit;
        while(n!=0){
            digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
class Solution {
    public boolean isHappy(int n) {
        int fastPointer=n,slowPointer=n;
        do{
            slowPointer=squaredNumber(slowPointer);//move one step
            fastPointer=squaredNumber(squaredNumber(fastPointer));//move 2 steps
        }while(slowPointer!=fastPointer);// untill found the cycle

        return slowPointer==1;
    }
    private int squaredNumber(int n){
        int digit,sum=0;
        while(n!=0){
            digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }

}

//Time Complexity: O(LogN)
//Space Complexity: O(1)