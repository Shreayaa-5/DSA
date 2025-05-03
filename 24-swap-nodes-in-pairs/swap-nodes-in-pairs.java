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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        if(head==null||head.next==null)return head;
        ListNode prev=dummy;
        ListNode first=head;
        ListNode second=first.next;
        while(first.next!=null && second!=null){
            prev.next=second;
            first.next=second.next;
            second.next=first;
            prev=prev.next.next;
            first=first.next;
            if(second.next==null||second.next.next==null)return dummy.next;
            second=second.next.next.next;
        }
        return dummy.next;
    }
}