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
        int carry = 0;
        ListNode res = new ListNode();
        ListNode result = res;
        while(l1 != null || l2 != null){
            int add = carry;
            if(l1 != null){
                add += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                add += l2.val;
                l2 = l2.next;
            }
            result.next = new ListNode(add%10);
            carry = add/10;
            result = result.next;
            
        }
        while(carry != 0){
            result.next = new ListNode(carry%10);
            carry = carry/10;
            result = result.next;
        }
        return res.next;
    }
}