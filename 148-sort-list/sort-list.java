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
    public ListNode sortList(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode mid=GetMiddle(head);
        ListNode rightHead=mid.next;
        //because 1 2 mid.next=null
        //mid 6 7 8
        mid.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(rightHead);
        return merge(left,right);
    }
    public ListNode GetMiddle(ListNode head){
        ListNode start=head;
        ListNode end=head;
        while(end.next!=null && end.next.next!=null){
            start=start.next;
            end=end.next.next;
        }
        return start;
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                tail.next=l1;
                l1=l1.next;
            }else{
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }
        if(l1!=null){
            tail.next=l1;
        }if(l2!=null){
            tail.next=l2;
        }
        return dummy.next;
    }
}