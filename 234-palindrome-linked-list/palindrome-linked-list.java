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
    public boolean isPalindrome(ListNode head) {
        ListNode curr=head;
        StringBuilder sb = new StringBuilder();
        while(curr!=null){
            sb.append(curr.val);
            curr=curr.next;
        }
        String s=sb.toString();
        String reverse=sb.reverse().toString();
        return s.equals(reverse);

    }
}