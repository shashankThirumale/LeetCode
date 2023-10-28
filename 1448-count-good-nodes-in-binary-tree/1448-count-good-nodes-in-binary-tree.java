/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        return helper(root, Integer.MIN_VALUE);
    }
    public int helper(TreeNode root, int past){
        if(root == null){
            return 0;
        }
        int sum = helper(root.right, Math.max(root.val, past)) + helper(root.left, Math.max(root.val, past));
        if(root.val >= past){
            sum++;
        }
        return sum;
    }
}