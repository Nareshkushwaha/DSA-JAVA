
package LinkedList;

public class InsertAtHead {
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

        void InsertAtHead(int val) {
            Node temp = new Node(val);
            // linkedlist empty :
            if (head == null) {
                head = temp;
                tail = temp;
            }
            // linked list is not empty
            else {
                temp.next = head;
                // head position is changes
                head = temp;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.display();
        System.out.println();
        ll.InsertAtHead(92);
        ll.display();
    }
}