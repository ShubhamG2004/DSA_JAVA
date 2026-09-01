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
    public int sumOfLeftLeaves(TreeNode root) {
        // code here
        return getSum(root, false);
    }
    public int getSum(TreeNode root, boolean isLeftChild){
        if(root.left == null && root.right == null){
            return (isLeftChild)?root.val:0;
        }
        
        int sum = 0;
        if(root.left != null){
            sum+=getSum(root.left, true);
        }
        
        if(root.right != null){
            sum+=getSum(root.right, false);
        }
        
        return sum;
    }
}
