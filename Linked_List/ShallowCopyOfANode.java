package Linked_List;
public class ShallowCopyOfANode {
    public static void main(String[] args) {
        Node a = new Node(100);
        System.out.println(a.val);
        Node temp = a; // shallow Copy
        // Node temp = new Node(100); // deep copy
        temp.val = 12;
        System.out.println(a.val);
    }

}
