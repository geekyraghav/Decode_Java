package Trees;

import java.util.*;

public class Traversals {
    public static class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(1); // a is the root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h; f.right = i;
        System.out.print("Preorder : ");
        preorder(a);
        System.out.println();
        System.out.print("Inorder : ");
        inorder(a);
        System.out.println();
        System.out.print("Postorder : ");
        postorder(a);
        System.out.println();
        System.out.println("Level Order : ");
        levelOrder(a);
//        for(int x=0;x<=3;x++){
//            nThLevel(a,0,x);
//            System.out.println();
//        }

    }
    private static void nThLevel(Node root, int level, int lvl){
        if(root==null) return;
        if(level==lvl) System.out.print(root.val+" ");
        nThLevel(root.right,level+1,lvl);
        nThLevel(root.left,level+1,lvl);
    }
    private static void levelOrder(Node root){
        int prevlevel = 0;
        Queue<Pair> q = new LinkedList<>();
        if(root!=null) q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front = q.remove();
            Node temp = front.node;
            int lvl = front.level;
            if(lvl!=prevlevel){
                System.out.println();
                prevlevel++;
            }

            System.out.print(temp.val+" ");

            if(temp.left!=null) q.add(new Pair(temp.left,lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right,lvl+1));
        }
        System.out.println();
    }
    private static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
//    private static void postorder(Node root){
//        if(root==null) return;
//        postorder(root.left);
//        postorder(root.right);
//        System.out.print(root.val+" ");
//    }
    private static void postorder(Node root){
        Stack<Node> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        if(root!=null) st.push(root);
        while(st.size()>0){
            Node top = st.pop();
            ans.add(top.val);
            if(top.left!=null) st.push(top.left);
            if(top.right!=null) st.push(top.right);
        }
        Collections.reverse(ans);
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
