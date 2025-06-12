public static int minD(TreeNode root, int key) {
    if (root == null)
        return -1;

    if (root.data == key)
        return 0;

    int left = minD(root.left, key);
    if (left != -1)
        return left + 1;

    int right = minD(root.right, key);
    if (right != -1)
        return right + 1;

    return -1; // not found in either subtree
}
