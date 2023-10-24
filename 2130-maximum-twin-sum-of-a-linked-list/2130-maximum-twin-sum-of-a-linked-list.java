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
    public int pairSum(ListNode head) {
        int size = 0;
        for(ListNode curr = head; curr != null; curr = curr.next){
            size++;
        }
        int[] arr = new int[size];
        int index = 0;
        for(ListNode curr = head; curr!= null; curr = curr.next){
            arr[index] = curr.val;
            index++;
        }
        int largestSum = 0;
        int right = size-1;
        int left = 0;
        while(left<=right){
            int currSum = arr[left]+arr[right];
            if(currSum > largestSum){
                largestSum = currSum;
            }
            left++;
            right--;
        }
        return largestSum;
    }
}