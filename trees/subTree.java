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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        return helper(root,subRoot);
    }

   
   public boolean isIdentical(TreeNode root1, TreeNode root2){

    if(root1==null && root2==null)
    return true;

    if(root1==null || root2==null ||root1.val!=root2.val)
    return false;

    return isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right);
    
   }


    public boolean helper(TreeNode root, TreeNode subroot){

        if( isIdentical(root,subroot))
        {
            return true;
        }

        if(root == null)
        return false;

        return helper(root.left,subroot) || helper(root.right,subroot);

        
    }
}
