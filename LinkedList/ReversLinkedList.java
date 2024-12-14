package LinkedList;

public class ReversLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // display :
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node reverse(Node head) {
        Node pre = null; // Start with pre as null
        Node curr = head;

        while (curr != null) {
            Node next = curr.next; // Store next node
            curr.next = pre; // Reverse the link
            pre = curr; // Move pre to current node
            curr = next; // Move to next node
        }
        return pre; // New head of the reversed list
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        System.out.print("Original list: ");
        display(a);
        System.out.println();

        Node rev = reverse(a);
        System.out.print("Reversed list: ");
        display(rev);
    }
}
