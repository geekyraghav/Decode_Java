package Trees;

import java.util.Arrays;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class NodeOfTree {
    public static void main(String[] args) {
        Node a = new Node(1); // a is the root
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        Node g = new Node(10);
        Node h = new Node(20);
        c.left = g; e.right = h;
        display(a);
        System.out.println();
        System.out.println(sum(a));
        System.out.println(max(a));
        System.out.println(size(a));
        System.out.println(levels(a));

    }
    private static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    private static int size(Node root){
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    private static int levels(Node root){
        if(root==null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }

    private static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int a = root.val, b = max(root.left), c = max(root.right);
        return Math.max(a,Math.max(b,c));
    }

    private static void display(Node root){
        if(root==null) return; // Base Case
        System.out.print(root.val+" "); // Self
        display(root.left); // Left SubTree
        display(root.right); // Right SubTree
    }
}
