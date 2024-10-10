package Recursion_Level_2;

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
public class DeleteLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        delete(head);
        head=null;
        System.out.println("Linked List is Deleted");
    }
    public static void delete(Node curr){
        if(curr==null){
            return;
        }
        delete(curr.next);
        curr=null;
    }
}
