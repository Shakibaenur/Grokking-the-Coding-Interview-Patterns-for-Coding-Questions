package org.example.FastSlowPointer;

public class LinkedListCycle {

  //Here we have used Fast & Slow pointer approach/Hare & Tortoise algorithm
    //The fast pointer is one step behind the slow pointer.
  //The fast pointer is two steps behind the slow pointer.
   class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
   }
    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (slow == fast)
                    return true; // found the cycle
            }
            return false;
        }
    }
}

/*Time Complexity
As we have concluded above,
 once the slow pointer enters the cycle,
 the fast pointer will meet the slow pointer in the same loop.
 Therefore, the time complexity of our algorithm will be O(N) where ‘N’
 is the total number of nodes in the LinkedList.

Space Complexity

The algorithm runs in constant space O(1).

*/
