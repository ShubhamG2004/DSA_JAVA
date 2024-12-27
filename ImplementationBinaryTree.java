public class ImplementationBinaryTree { // Fixed class name spelling
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void display(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " -> ");

        if (root.left != null) {
            System.out.print("L:" + root.left.val + " ");
        } else {
            System.out.print("L:null ");
        }

        if (root.right != null) {
            System.out.print("R:" + root.right.val);
        } else {
            System.out.print("R:null");
        }

        System.out.println();

        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        Node a = new Node(6);
        Node b = new Node(10);

        root.left = a;
        root.right = b;

        Node c = new Node(2);
        Node d = new Node(7);
        a.left = c;
        a.right = d;

        Node e = new Node(9);
        Node f = new Node(12);
        b.left = e;
        b.right = f;

        Node g = new Node(11);
        Node i = new Node(13);
        f.left = g;
        f.right = i;

        display(root);
    }
}
