package Linked_List;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class ListNodeClass {
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void displayRecursive(Node head){
        if(head==null) return; // base case
        System.out.println(head.val);
        displayRecursive(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(10); // head
        Node b = new Node(23);
        Node c = new Node(37);
        Node d = new Node(48);
        Node e = new Node(53);
        Node f = new Node(67);
        a.next = b; // 10->20
        b.next = c; // 10->20->30
        c.next = d; // 10->20->30->40
        d.next = e; // 10->20->30->40->50
        e.next = f;

        displayRecursive(a);

//        System.out.println(a.val);
//        System.out.println(a.next.val);
//        System.out.println(a.next.next.val);
//        System.out.println(a.next.next.next.val);
//        System.out.println(a.next.next.next.next.val);

    }
}
