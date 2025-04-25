public class ValidateBST {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int item) {
            val = item;
            left = right = null;
        }
    }
    static class Construct {
        public static TreeNode constructBST(TreeNode root, int data) {
            if (root == null) {
                return new TreeNode(data);
            }
            if (data < root.val) {
                root.left = constructBST(root.left, data);
            } else if (data > root.val) {
                root.right = constructBST(root.right, data);
            }
            return root;
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
    public static void main(String args[]){
        int[] arr = {9, 8, 2, 6, 12, 19,4, 7};

        TreeNode root = null;

        for (int value : arr) {
            root = Construct.constructBST(root, value);
        }

        System.out.println();
        
        Construct.printPreOrder(root);

        System.out.println(isValidBST(root));
    }
}
