package LinkedList;

public class FindMidElements {
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

        int findMiddle() {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;      
                fast = fast.next.next; 
            }

            return slow.data; 
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        
        System.out.print("Linked List: ");
        ll.display();

        int middle = ll.findMiddle();
        System.out.println("Middle Element: " + middle);
    }
}
