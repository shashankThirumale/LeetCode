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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode result = new ListNode(head.val);
        for(ListNode curr = head.next; curr!=null; curr = curr.next){
            ListNode node = new ListNode(curr.val);
            node.next = result;
            result = node;
        }
        return result;
    }
}