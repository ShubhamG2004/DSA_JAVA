class Solution {

    int ans = 0;

    public int largestBst(Node root) {
        postOrder(root);
        return ans;
    }

    public int[] postOrder(Node root) {

        // [min, max, size]
        if (root == null) {
            return new int[]{
                Integer.MAX_VALUE,
                Integer.MIN_VALUE,
                0
            };
        }

        int[] left = postOrder(root.left);
        int[] right = postOrder(root.right);

        // Check if current subtree is a BST
        if (root.data > left[1] &&
            root.data < right[0]) {

            int size = left[2] + right[2] + 1;

            ans = Math.max(ans, size);

            int minVal = Math.min(root.data, left[0]);
            int maxVal = Math.max(root.data, right[1]);

            return new int[]{
                minVal,
                maxVal,
                size
            };
        }

        // Current subtree is NOT a BST
        // Keep the largest BST size from children
        int maxSize = Math.max(left[2], right[2]);

        return new int[]{
            Integer.MIN_VALUE,
            Integer.MAX_VALUE,
            maxSize
        };
    }
}