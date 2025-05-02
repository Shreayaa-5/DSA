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
        ListNode smallhead=dummy;
        ListNode dum=new ListNode(0);
        ListNode largehead=dum;

        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                smallhead.next=new ListNode(temp.val);
                smallhead=smallhead.next;
                System.out.println(temp.val+" smallll");
            }
            else{
                largehead.next=new ListNode(temp.val);
                largehead=largehead.next;
                System.out.println(temp.val+"larger");
            }
            temp=temp.next;
        }
        smallhead.next=dum.next;
        return dummy.next;
    }
}