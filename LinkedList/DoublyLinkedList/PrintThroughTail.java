package LinkedList.DoublyLinkedList;

public class PrintThroughTail {
    public static class Node {
        int data;
        Node next;
        Node preivous;

        Node(int data) {
            this.data = data;
        }
    }

    public static void printTail(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.preivous;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        a.preivous = null;
        b.next = c;
        b.preivous = a;
        c.next = d;
        c.preivous = b;
        d.next = null;
        d.preivous = c;
        printTail(d);

    }
}