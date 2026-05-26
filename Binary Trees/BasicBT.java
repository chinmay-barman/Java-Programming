public class BasicBT{
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val+ "->");
        if(root.left!=null){
            System.out.print(root.left.val+",");
        }
        else{
            System.out.print("null,");
        }
        if(root.right!=null){
            System.out.println(root.right.val);
        }
        else{
            System.out.println("null");
        }
        display(root.left);
        display(root.right);
    }
    public static void preOrderDisplay(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrderDisplay(root.left);
        preOrderDisplay(root.right);
    }
    public static int size(Node root){
        if(root==null){
            return 0;
        }
        return size(root.left)+size(root.right)+1;
    }
    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        return root.val+sumOfNodes(root.left)+sumOfNodes(root.right);
    }
    public static int maxValue(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val, Math.max(maxValue(root.left), maxValue(root.right)));
    }
    public static void main(String args[]){
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(6);
        Node d = new Node(5);
        Node e = new Node(11);
        
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        display(root);
        System.out.println("Pre-order traversal:");
        preOrderDisplay(root);
        System.out.println("\nSize of the tree: "+size(root));
        System.out.println("Sum of all nodes: "+sumOfNodes(root));
        System.out.println("Maximum value in the tree: "+maxValue(root));
    }
}