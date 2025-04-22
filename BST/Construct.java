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
        int[] arr = {9, 8, 2, 6, 12, 19,4, 7};

        TreeNode root = null;

        for (int value : arr) {
            root = constructBST(root, value);
        }

        System.out.println();
        
        printPreOrder(root);

        DeleteNode(root, 9);
        System.out.println();
        printPreOrder(root);
    }

    public static TreeNode DeleteNode(TreeNode root, int data){
        if(root == null){
             return null;
        }

        if(root.val > data){
            root.left = DeleteNode(root.left, data);
        }
        else if(root.val < data ){
            root.right = DeleteNode(root.right, data);
        }else{
            // Find Node 
            if(root.left == null && root.right == null){
                return null;
            }
            
            if(root.left ==null ){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                TreeNode node = predecessor(root.left);
                root.val = node.val;
                root.left = DeleteNode(root.left, node.val);
            }
        }
        return root;
    }
    public static TreeNode predecessor(TreeNode root){
        if(root == null){
            return null;
        }
        while(root.right != null){
            root = root.right;
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
