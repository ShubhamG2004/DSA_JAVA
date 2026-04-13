import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeSize {
    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val=val;
        }
    }
    public static int size(Node root){
        if(root == null) return 0;
        int size=1 + size(root.left) + size(root.right);
        return size;
    }
    public static int Sum(Node root){
        if(root == null) return 0;

        int sum = root.val + Sum(root.left) + Sum(root.right); 
        return sum;
    }
    public static int MaxHeight(Node root){
        if(root==null) return 0;
        if(root.left == null && root.right==null) return 0;
         return 1+ Math.max(MaxHeight(root.left), MaxHeight(root.right));
    }
    public static int MaxValue(Node root){
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = MaxValue(root.right);
        int c = MaxValue(root.right);

        return Math.max(a, Math.max(b, c));
    }
    public static int MinValue(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(MinValue(root.left), MinValue(root.right)));
    }
    public static int ProductOfTree(Node root){
        if(root == null) return 1;

        int product = root.val * ProductOfTree(root.left) * ProductOfTree(root.right); 
        return product;
    }

    public static void NthLevel(Node root,int n){
        if(root == null) return;
        if(n==1) System.out.print(root.val+" ");

        NthLevel(root.left, n-1);
        NthLevel(root.right, n-1);
    }
    public static void BFSQueue(Node root){
        Queue<Node> q= new LinkedList<>();
        if(root!=null)q.add(root);
        while (q.size()>0) {
            Node temp= q.peek();
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
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

        System.out.println("Size of the Tree:"+size(root));
        System.out.println("Sum of the Tree:"+Sum(root));
        System.out.println("Max Value of the Node:"+MaxValue(root));
        System.out.println("Min Value of the Node:"+MinValue(root));
        System.out.println("Height of the Tree:"+ MaxHeight(root));
        System.out.println("Product of the Tree:"+ ProductOfTree(root));
        
        int level= 1+ MaxHeight(root);
        System.out.println("Value of Tree by Using the BFS:");
        for(int k=1;k<=level;k++){
            NthLevel(root, k);
            System.out.println();
        }

        System.out.println("Value of Tree by Using the BFS Queue:");
        BFSQueue(root);
    }
}
