public List<Integer> inorderTraversal(TreeNode root) {

    List<Integer> ans = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();

    TreeNode curr = root;

    while (curr != null || !stack.isEmpty()) {

        // Go as left as possible
        while (curr != null) {
            stack.push(curr);
            curr = curr.left;
        }

        // Process node
        curr = stack.pop();
        ans.add(curr.val);

        // Move to right subtree
        curr = curr.right;
    }

    return ans;
}