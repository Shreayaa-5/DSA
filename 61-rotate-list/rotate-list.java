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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        if(k==0||head==null) return head;
        int length=1;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        System.out.println(length);
        temp.next=head;
        int h=k%length;
        ListNode tail=head;
        for(int i=0;i<length-h-1;i++){
            tail=tail.next;
        }
        ListNode newhead=tail.next;
        tail.next=null;
        return newhead;
    }
}