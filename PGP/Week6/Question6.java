package PGP.Week6;


public class Question6{ 

    int minDiff = Integer.MAX_VALUE;
    TreeNode prev = null;

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    private void inorder(TreeNode node) {
        if (node == null) return;

        inorder(node.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, node.val - prev.val);
        }

        prev = node;

        inorder(node.right);
    }

    public static void main(String[] args) {
        Question6 q = new Question6();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        System.out.println(q.getMinimumDifference(root));
    }

}


// Brute Force Approach
/* 
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        collect(root, list);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                minDiff = Math.min(minDiff,
                                   Math.abs(list.get(i) - list.get(j)));
            }
        }

        return minDiff;
    }

    private void collect(TreeNode node, List<Integer> list) {
        if (node == null) return;

        list.add(node.val);
        collect(node.left, list);
        collect(node.right, list);
    }
*/