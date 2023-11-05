package org.example.FastSlowPointer;

public class FindMiddleofLinkedList {

    /*One brute force strategy could be to first count the number of nodes in
    the LinkedList and then find the middle node in the second iteration. Can we do this in one iteration?
    We can use the Fast & Slow pointers method such that the fast pointer
     is always twice the nodes ahead of the slow pointer. This way, when
     the fast pointer reaches the end of the LinkedList, the slow pointer
     will be pointing at the middle node.*/



     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        public ListNode middleNode(ListNode head) {
            // //Brute Force Approach
            // int count=0;
            // if(head==null)
            // return null;

            // int count=0;
            // ListNode current=head;
            // //now we will count the number of nodes in the Linked List
            // while(current!=null){
            //     count++;
            //     current=current.next;
            // }

            // int middle=count/2;
            // count=0;
            // while(current<middle){
            //     count++;
            //     current=current.next;
            // }
            // return current;


            //Lets apply fast and slow pointer approach
            if(head==null){
                return null;
            }
            ListNode fast=head;
            ListNode slow=head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;
        }
    }
}

/*Time Complexity
The above algorithm will have a time complexity of O(N)
 where ‘N’ is the number of nodes in the LinkedList.

Space Complexity
The algorithm runs in constant space O(1).*/
