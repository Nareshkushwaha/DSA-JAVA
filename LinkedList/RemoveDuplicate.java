package LinkedList;

public class RemoveDuplicate {
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
                tail = temp; 
            } else {
                tail.next = temp;
                tail = temp; 
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(); 
        }

        void removeDuplicates() {
            Node current = head;
            Node previous = null;

            while (current != null) {
                if (previous != null && previous.data == current.data) {
                    previous.next = current.next;
                } else {
                    previous = current;
                }
                current = current.next; 
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(4);
        ll.add(5);
        
        System.out.print("Original List: ");
        ll.display();

        ll.removeDuplicates();
        
        System.out.print("List after removing duplicates: ");
        ll.display();
    }
}
