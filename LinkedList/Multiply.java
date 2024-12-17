package LinkedList;
public class Multiply {
    // node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void dislay(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // one element
    public static int merge(Node head) {
        Node temp = head;
        int sum = 0;
        while (temp != null) {
            sum = sum * 10 + temp.data;
            temp = temp.next;
        }
        return sum;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        a.next = b;
        b.next = null;
        // first linkedlist
        int n = merge(a);
        System.out.println("first linkedlist " + n);

        // second linked list :
        Node d = new Node(1);
        Node e = new Node(2);
        d.next = e;
        e.next = null;
        int m = merge(d);
        System.out.println("second linked list " + m);
        // multiply two list :
        int k = n * m;
        System.out.println("multiply two list " + k);
    }
}
