class Solution {
    int diameter = 0;

    int height(Node root) {
        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        // Diameter passing through current node
        diameter = Math.max(diameter, left + right);

        // Return height
        return 1 + Math.max(left, right);
    }

    int diameter(Node root) {
        height(root);
        return diameter;
    }
}