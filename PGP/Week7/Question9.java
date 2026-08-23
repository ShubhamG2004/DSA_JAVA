class Solution {
    public boolean search(Node root, int val) {

        // Value not found
        if (root == null) {
            return false;
        }

        // Value found
        if (root.data == val) {
            return true;
        }

        // Search right subtree
        if (root.data < val) {
            return search(root.right, val);
        }

        // Search left subtree
        return search(root.left, val);
    }
}