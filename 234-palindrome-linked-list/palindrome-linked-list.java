/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow = head ;
        while (fast.next!= null && fast.next.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
        ListNode head1 = slow.next;
        slow.next = null;
        ListNode curr = head1;
        ListNode prev=null;
        ListNode next;
        while (curr != null){
            next = curr.next ;
            curr.next = prev ;
            prev=curr;
            curr= next;
        }
        head1 = prev;

        ListNode curr1=head ;
        ListNode curr2=head1 ;
        while ( curr1 !=null && curr2 != null){
                if ( curr1.val != curr2.val){
                    return false ;
                }
                curr1= curr1.next;
                curr2= curr2.next;
        }
   return true;
        
    }
}