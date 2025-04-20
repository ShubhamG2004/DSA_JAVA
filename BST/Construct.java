public class Construct {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Construct BST without allowing duplicate values
    public static TreeNode constructBST(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }

        TreeNode temp = root;
        while (temp != null) {
            if (data < temp.val) {
                if (temp.left == null) {
                    temp.left = new TreeNode(data);
                    break;
                } else {
                    temp = temp.left;
                }
            } else{
                if (temp.right == null) {
                    temp.right = new TreeNode(data);
                    break;
                } else {
                    temp = temp.right;
                }
            }
        }

        return root;
    }

    public static void main(String[] args) {
        int[] arr = {20, 8, 2, 6, 12, 19,4, 7};

        TreeNode root = null;

        for (int value : arr) {
            root = constructBST(root, value);
        }

        System.out.println();
        
        printPreOrder(root);
    }

    
    public static void printPreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
}
