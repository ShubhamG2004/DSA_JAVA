public class BuildBST {     
    static class Node {         
        int val;         
        Node left, right;          
        
        Node(int val) {             
            this.val = val;         
        }     
    } 
    
    static Node BuildTree(Node root, int val) {         
        if (root == null) {             
            return new Node(val); 
        }          
        
        if (root.val > val) {             
            root.left = BuildTree(root.left, val);         
        } else {             
            root.right = BuildTree(root.right, val);         
        }         
        return root;     
    }          
    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.println(root.val);
        Inorder(root.right);
    }
    public static void main(String[] args) {         
        int values[] = {5, 1, 3, 4, 2, 7};         
        Node root = null;                   
        
        for (int val : values) {             
            root = BuildTree(root, val);         
        }     
        Inorder(root); 
    } 
}
