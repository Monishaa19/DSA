public static void rootToLeaf(TreeNode root, List<Integer> path) {
    if (root == null)
        return;

    path.add(root.data);

    if (root.left == null && root.right == null) {
        // Leaf node reached, print path
        System.out.println(path);
    } else {
        // Recurse left and right
        rootToLeaf(root.left, path);
        rootToLeaf(root.right, path);
    }

    // Backtrack
    path.remove(path.size() - 1);
}
