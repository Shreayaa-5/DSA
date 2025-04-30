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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ListNode curr=head;
        while(curr!=null){
            hm.put(curr.val,hm.getOrDefault(curr.val,0)+1);
            curr=curr.next;
        }
        while (head != null && hm.get(head.val) > 1) {
            head = head.next;
        }
        ListNode temp=head;
        while(temp!=null){
            if(temp.next==null) return head;
            if(hm.get(temp.next.val)>1){
                temp.next=temp.next.next;
                continue;
            }
            temp=temp.next;
        }
        
        return head;
    }
}