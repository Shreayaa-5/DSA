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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int length=0;
        while (curr!=null){
            curr=curr.next;
            length++;
        }
        int c=length-n;
        ListNode temp=head;
        if (n == length) {
            return head.next;
        }

        while(c>1){
            c--;
            temp=temp.next;
        }
        if(temp.next==null || temp==null) return head;
        temp.next=temp.next.next;
        return head;
    }
}