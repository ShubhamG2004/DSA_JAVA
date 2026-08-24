class Solution {
    public Node LCA(Node root, Node p, Node q) {

        if (root == null) {
            return null;
        }

        // Both nodes are on the right
        if (p.data > root.data && q.data > root.data) {
            return LCA(root.right, p, q);
        }

        // Both nodes are on the left
        if (p.data < root.data && q.data < root.data) {
            return LCA(root.left, p, q);
        }

        // They are on different sides,
        // or root itself is p or q
        return root;
    }
}