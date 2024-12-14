package LinkedList;

public class DeletIndex {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // create linkedlist
    public static class Linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int val) { 
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        // display
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        // delete at any index
        void delete(int index) {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public static void main(String[] args) { 
        Linkedlist ll = new Linkedlist();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.display();
        System.out.println();
        ll.delete(2);
        ll.display();
    }
}








