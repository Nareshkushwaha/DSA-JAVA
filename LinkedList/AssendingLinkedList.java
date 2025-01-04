package LinkedList;


public class AssendingLinkedList {
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

        void sort() {
            if (head == null) 
            return;

            int size = getSize();
            int[] arr = new int[size];
            Node current = head;
            for (int i = 0; i < size; i++) {
                arr[i] = current.data;
                current = current.next;
            }

            java.util.Arrays.sort(arr);

            current = head;
            for (int i = 0; i < size; i++) {
                current.data = arr[i];
                current = current.next;
            }
        }

        int getSize() {
            Node current = head;
            int size = 0;
            while (current != null) {
                size++;
                current = current.next;
            }
            return size;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(40);
        ll.add(10);
        ll.add(50);
        ll.add(20);
        ll.add(30);
        
        System.out.print("Original List: ");
        ll.display();

        ll.sort();
        
        System.out.print("Sorted List: ");
        ll.display();
    }
}
