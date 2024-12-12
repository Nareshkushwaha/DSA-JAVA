package LinkedList;

public class FindDuplicate {
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

        void duplicate() { 
            Node temp1 = head;
            Node temp2 = head.next;
            while (temp1 != null) {
                while (temp2 != null) {
                    if (temp1.data == temp2.data) {
                        System.out.println(temp1.data);
                    }
                    temp2 = temp2.next;
                }
                temp1 = temp1.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(61);
        ll.add(42);
        ll.add(33);
        ll.add(61);
        ll.add(95);
        ll.duplicate();
    }
}
