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
        ArrayList<Integer> list1 = new ArrayList<>();
        while(l1 != null){
            list1.add(l1.val);
            l1 = l1.next;
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        while(l2!=null){
            list2.add(l2.val);
            l2 = l2.next;
        }
        int num2 = list2.size()-1;
        int num1 = list1.size()-1;
        int temp =list2.get(num2--)+list1.get(num1--);
        int remainder = temp/10;
        temp%=10;
        ListNode result = new ListNode(temp);
        
        while(num2 >= 0 || num1 >= 0){
            int sum= 0+remainder;
            if(num2>=0){
                sum+=list2.get(num2--);
            }
            if(num1 >= 0){
                sum+=list1.get(num1--);
            }
            remainder = sum/10;
            sum = sum%10;
            ListNode add = new ListNode(sum, result);
            result = add;
        }
        if(remainder > 0){
            ListNode add = new ListNode(remainder, result);
            result = add;
        }
        return result;
    }
}