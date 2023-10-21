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
    public ListNode deleteMiddle(ListNode head) {
        int size = 0;
        for(ListNode curr = head; curr != null; curr = curr.next){
            size++;
        }
        int index = size/2;
        if(index == 0){
            head = head.next;
            return head;
        }else{
            ListNode prev = null;
            ListNode curr = head;
            int i = 0;
            while(i < index){
                prev = curr;
                curr = curr.next;
                i++;
            }
            prev.next = curr.next;
            return head;
        }
    }
}