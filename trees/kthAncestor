class Solution {
    
    int ans = -1;
    
    public int kthAncestor(Node root, int k, int node) {
        helper(root, k, node);
        return ans;
    }
    
    public int helper(Node root, int k, int node) {
        if (root == null)
            return -1;
        
        if (root.data == node)
            return 0;
        
        int left = helper(root.left, k, node);
        if (left != -1) {
            if (left == k - 1)
                ans = root.data;
            return left + 1;
        }
        
        int right = helper(root.right, k, node);
        if (right != -1) {
            if (right == k - 1)
                ans = root.data;
            return right + 1;
        }
        
        return -1;
    }
}
