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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return root;
        }
        if(key < root.val){
            root.left =  deleteNode(root.left, key);
            return root;
        }else if(key > root.val){
            root.right = deleteNode(root.right, key);
            return root;
        }else{
            if(root.right != null){
                root.val = min(root.right);
                root.right = deleteNode(root.right, root.val);
                return root;
            }else{
               if(root.left != null){
                   root.val = max(root.left);
                   root.left = deleteNode(root.left, root.val);
                   return root;
               }else{
                   root = null;
                   return root;
               } 
            }
        }
    }
    private static int min(TreeNode root){
        if(root.left == null){
            return root.val;
        }else{
            return min(root.left);
            
        }
    }
    private static int max(TreeNode root){
        if(root.right == null){
            return root.val;
        }else{
            return max(root.right);
        }
    }
}