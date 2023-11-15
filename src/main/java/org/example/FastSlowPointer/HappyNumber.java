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
        HashSet<Integer> set=new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=numberOfSquare(n);

        }
        return n==1;
    }
    private int numberOfSquare(int n){
        int sum=0,digit;
        while(n!=0){
            digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
}

//Time Complexity: O(k)
//Space Complexity: O(n)
