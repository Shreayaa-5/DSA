import java.math.BigInteger;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int[] arr1 = new int[100];
        int[] arr2 = new int[100];

        ListNode temp = l1;
        int k = 0;
        while (temp != null) {
            arr1[k++] = temp.val;
            temp = temp.next;
        }

        ListNode temp1 = l2;
        int j = 0;
        while (temp1 != null) {
            arr2[j++] = temp1.val;
            temp1 = temp1.next;
        }

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (int i = k - 1; i >= 0; i--) {
            s1.append(arr1[i]);
        }
        for (int i = j - 1; i >= 0; i--) {
            s2.append(arr2[i]);
        }

        BigInteger num1 = new BigInteger(s1.toString());
        BigInteger num2 = new BigInteger(s2.toString());
        BigInteger res = num1.add(num2);

        // Build result list
        if (res.equals(BigInteger.ZERO)) return new ListNode(0);

        ListNode head = new ListNode(0); // dummy head

        while (res.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] divmod = res.divideAndRemainder(BigInteger.TEN);
            int digit = divmod[1].intValue();
            res = divmod[0];

            // Create new node
            ListNode newnode = new ListNode(digit);

            // Traverse from head to the end using curr.next
            ListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newnode;
        }

        return head.next;
    }
}
