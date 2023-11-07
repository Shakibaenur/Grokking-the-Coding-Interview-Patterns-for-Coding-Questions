package org.example.TwoPointer;

public class FindNonDuplicateNumberInstance {


        public static int remove(int[] arr) {
            int nextNonDuplicate = 1; // index of the next non-duplicate element
            for (int i = 0; i < arr.length; i++) {
                if (arr[nextNonDuplicate - 1] != arr[i]) {
                    arr[nextNonDuplicate] = arr[i];
                    nextNonDuplicate++;
                }
            }

            return nextNonDuplicate;
        }

        public static void main(String[] args) {
            int[] arr = new int[] { 2, 3, 3, 3, 6, 9, 9 };
            System.out.println(remove(arr));

            arr = new int[] { 2, 2, 2, 11 };
            //System.out.println(remove(arr));
        }

    //T.C: O(N)
    //S.C: O(1)
}
