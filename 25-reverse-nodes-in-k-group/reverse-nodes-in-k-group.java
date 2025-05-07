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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Calculate the length of the list
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 0; i < length / k; i++) {
            ListNode curr = prev.next;
            ListNode next = curr.next;
            for (int j = 0; j < k-1; j++) {
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }
            prev = curr;
        }

        return dummy.next;
    }
}


