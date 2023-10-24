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
    public ListNode oddEvenList(ListNode head) {
        if(head == null|| head.next == null){
            return head;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(ListNode curr = head; curr != null; curr = curr.next){
            arr.add(curr.val);
        }
        ListNode result = new ListNode(arr.get(0));
        ListNode even = new ListNode(arr.get(1));
        ListNode odd = result;
        ListNode evenCopy = even;
        for(int i = 2; i < arr.size(); i++){
            if(i%2 == 0){
                odd.next = new ListNode(arr.get(i));
                odd = odd.next;
            }else{
                evenCopy.next = new ListNode(arr.get(i));
                evenCopy = evenCopy.next;
            }
        }
        odd.next = even;
        return result;
    }
}