/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lena=getlen(headA);
        int lenb=getlen(headB);
        ListNode ptra=headA;
        ListNode ptrb=headB;
        if(lena>lenb){
            int a=lena-lenb;
            while(a>0){
                ptra=ptra.next;
                a--;
            }
        }else{
            int a=lenb-lena;
            while(a>0){
                ptrb=ptrb.next;
                a--;
            }
        }
        while(ptra!=null && ptrb!=null){
            if(ptra==ptrb){
                return ptra;
            }
            ptra=ptra.next;
            ptrb=ptrb.next;
        }
        return null;
        
    }
    private int getlen(ListNode head){
        int l=0;
        ListNode curr=head;
        while(curr!=null){
            l++;
            curr=curr.next;
        }
        return l;
    }
}