package LinkedList.SingalLinkedList;

public class MergTwoLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
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

        LinkedList merge(LinkedList list2) {
            LinkedList mergedList = new LinkedList();
            Node current1 = head;
            Node current2 = list2.head;

            while (current1 != null && current2 != null) {
                if (current1.data <= current2.data) {
                    mergedList.add(current1.data);
                    current1 = current1.next;
                } else {
                    mergedList.add(current2.data);
                    current2 = current2.next;
                }
            }

            while (current1 != null) {
                mergedList.add(current1.data);
                current1 = current1.next;
            }

            while (current2 != null) {
                mergedList.add(current2.data);
                current2 = current2.next;
            }

            return mergedList;
        }
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);

        LinkedList list2 = new LinkedList();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);

        System.out.print("List 1: ");
        list1.display();
        System.out.print("List 2: ");
        list2.display();

        LinkedList mergedList = list1.merge(list2);

        System.out.print("Merged List: ");
        mergedList.display();
    }
}
