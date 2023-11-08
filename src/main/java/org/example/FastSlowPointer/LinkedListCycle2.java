package org.example.FastSlowPointer;

public class LinkedListCycle2 {


    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode fast=head;
            ListNode slow=head;
// Move the slow pointer one step and the fast pointer two steps at a time through the linked list,
            // until they either meet or the fast pointer reaches the end of the list.

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    // If the pointers meet, there is a cycle in the linked list.
                    // Reset the slow pointer to the head of the linked list, and move both pointers one step at a time
                    // until they meet again. The node where they meet is the starting point of the cycle.

                    slow=head;
                    while(slow!=fast){
                        slow=slow.next;
                        fast=fast.next;
                    }
                    return slow;
                }
            }
            return null;
        }
    }

    //T.C: O(N^2)
    //S.C: O(1)
}
