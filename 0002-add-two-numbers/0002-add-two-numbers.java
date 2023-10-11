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
        ListNode l3 = new ListNode(0);
        ListNode dummy = l3;
        int carry = 0;
        while(l1 != null || l2!= null || carry!=0){
            int sum = 0; 
            sum += (l1 != null) ? l1.val : 0;
            sum += (l2 != null) ? l2.val : 0;
            sum+=carry;
            ListNode newNode = new ListNode((sum)%10);
            dummy.next = newNode;
            dummy = dummy.next;
            carry = sum/10;
            l1 = (l1 != null)? l1.next : null;
            l2 = (l2 != null)? l2.next : null;
        }
        ListNode result = l3.next;
        l3.next = null;
        return result;
    }
}