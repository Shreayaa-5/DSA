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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        dummy.next=head;
        for(int i=0;i<left-1;i++){
            prev=prev.next;
        }
        ListNode main=prev.next;
        ListNode nxt=main.next;
        for(int i=0;i<right-left;i++){
            main.next=nxt.next;
            nxt.next=prev.next;
            prev.next=nxt;
            nxt=main.next;
        }

        return dummy.next;
    }
}