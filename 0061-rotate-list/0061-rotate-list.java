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
        if(head == null || k == 0){
            return head;
        }
        ListNode last = head;
        int len = 1;
        while(last.next != null){
            len++;
            last = last.next;
        }
        
        
        k = k % len;
        if(k == 0){
            return head;
        }
        
        last.next = head;
        ListNode curr = head;
        for(int i = 0; i < len-k-1; i++){
            curr = curr.next;
        }
        
        ListNode result = curr.next;
        curr.next = null;
        
        return result;
    }
    
}