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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(0);
        merge(dummy,list1,list2);
        return dummy.next;
    }
    public void merge(ListNode dummy,ListNode list1,ListNode list2){
        if(list1==null ){
            dummy.next=list2;
            return;
        }if(list2==null){
            dummy.next=list1;
            return;
        }
        if(list1.val<list2.val){
            dummy.next=list1;
            merge(dummy.next,list1.next,list2);
        }else{
            dummy.next=list2;
            merge(dummy.next,list1,list2.next);
        }
        }
    }

