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
    public ListNode swapNodes(ListNode head, int k) {
        int last = k;
        ListNode fir = null;
        ListNode curr = head;
        for(int i = 0; i < k-1; i++){
            curr = curr.next;
        }
        fir = curr;
        curr = curr.next;
        ListNode tail = head;
        while(curr!=null){
            curr = curr.next;
            tail = tail.next;
        }
        int temp = tail.val;
        tail.val = fir.val;
        fir.val = temp;
        return head;
    }
}