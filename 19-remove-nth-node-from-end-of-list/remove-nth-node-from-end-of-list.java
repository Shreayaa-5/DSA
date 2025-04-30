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
        while (curr.next!=null){
            curr=curr.next;
            length++;
        }
        System.out.println(curr.val);
        System.out.println(length+1-n);
        int c=length+1-n;
        ListNode temp=head;
        if (n == length+1) {
            return head.next;
        }

        while(c>1){
            c--;
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println(temp.val);
        if(temp.next==null || temp==null) return head;
        temp.next=temp.next.next;
        return head;
    }
}