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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        ListNode dum=new ListNode(0);
        ListNode cc=dum;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                curr.next=new ListNode(temp.val);
                curr=curr.next;
                System.out.println(temp.val+"smallll");
            }
            else{
                cc.next=new ListNode(temp.val);
                cc=cc.next;
                System.out.println(temp.val+"larger");
            }
            temp=temp.next;
        }
        curr.next=dum.next;
        return dummy.next;
    }
}