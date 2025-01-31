package Queue;

public class QueueRemoveadd {
    public static class Queue {
        int f = -1; 
        int r = -1; 
        int size = 0; 
        int a[] = new int[5]; 
        public void add(int val) {
            if (r == a.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (f == -1) {
                f = r = 0; 
                a[r] = val; 
            } else {
                a[++r] = val; 
            }
            size++;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = f; i <= r; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int removedValue = a[f++];
                size--;
                if (isEmpty()) { 
                    f = r = -1;
                }
                return removedValue;
            }
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return a[f];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int firstRemove() {
            return remove();
        }

        public int lastRemove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int removedValue = a[r--];
            size--;
            if (isEmpty()) { 
                f = r = -1;
            }
            return removedValue;
        }

        public void update(int index, int value) {
            if (index < f || index > r) {
                System.out.println("Index out of bounds");
                return;
            }
            a[index] = value;
        }

        public void printAtIndex(int index) {
            if (index < f || index > r) {
                System.out.println("Index out of bounds");
                return;
            }
            System.out.println("Element at index " + index + ": " + a[index]);
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(56);
        q.add(67);
        q.add(12);
        q.add(1);
        q.add(23);
        
        System.out.println("Removed: " + q.remove());
        System.out.print("Current queue: ");
        q.display();

        System.out.println("Peek: " + q.peek());
        
        q.update(1, 100); 
        System.out.print("Queue after update: ");
        q.display();

        q.printAtIndex(2); 
        System.out.println("Last removed: " + q.lastRemove());
        System.out.print("Final queue: ");
        q.display();
    }
}
