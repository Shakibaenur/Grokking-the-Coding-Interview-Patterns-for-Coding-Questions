package org.example.FastSlowPointer;

public class LinkedListIsPalindrom {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public boolean isPalindrome(ListNode head) {
            if(head==null || head.next==null)
                return true;
            ListNode slow=head;
            ListNode fast=head;
            //Find the mid value by slow
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }

            ListNode headSecondHalf=reverse(slow);
            ListNode copyHeadSecondHalf=headSecondHalf;

            while(head!=null && headSecondHalf!=null){
                if(head.val!=headSecondHalf.val)
                    return false;
                head=head.next;
                headSecondHalf=headSecondHalf.next;
            }
            // reverse(copyHeadSecondHalf);
            if(head==null || headSecondHalf==null)
                return true;
            return false;

        }
        private ListNode reverse(ListNode head){
            ListNode prev=null;
            while(head!=null){
                ListNode next=head.next;
                head.next=prev;
                prev=head;
                head=next;
            }
            return prev;
        }

    }
}

/*Time Complexity
The above algorithm will have a time complexity of O(N) where ‘N’ is the number of nodes in the LinkedList.

Space Complexity
The algorithm runs in constant space O(1).*/
