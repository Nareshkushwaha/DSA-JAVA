package LinkedList;

public class CreateLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null; // Initialize next to null
        }
    }

    static class LinkedList {
        Node head = null;
        Node tail = null;

        void add(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp; // Set head to the new node
                tail = temp; // Set tail to the new node
            } else {
                tail.next = temp; // Link the new node to the end of the list
                tail = temp; // Update tail to the new node
            }
        }

        void display() {
            Node temp = head; // Start from the head
            while (temp != null) {
                System.out.print(temp.data + " "); // Print data
                temp = temp.next; // Move to the next node
            }
            System.out.println(); // Print a newline after displaying the list
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.display(); // Display the linked list
    }
}
