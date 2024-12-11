package LinkedList;

public class InsertAtIndex {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class LinkedList {
        Node head = null;
        Node tail = null;

        void add(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        void insertAtIndex(int index, int val) {
            Node temp = head;
            Node t = new Node(val);
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.display();
        System.out.println();
        ll.insertAtIndex(2, 92);
        ll.display();
    }
}