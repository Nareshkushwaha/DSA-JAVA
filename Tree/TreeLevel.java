package Tree;



import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeLevel {
    static Scanner sc = new Scanner(System.in);

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    // Method to create the tree
    static Node createTree() {
        System.out.println("Enter data (-1 to stop):");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }
        
        Node root = new Node(data);
        System.out.println("Enter left data for " + data);
        root.left = createTree();

        System.out.println("Enter right data for " + data);
        root.right = createTree();

        return root;
    }

    // Method to print the levels of the tree
    public static void printLevels(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                System.out.print(currentNode.data + " ");
                
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            System.out.println(); // New line after each level
        }
    }

    // Method to calculate the height of the tree
    public static int height(Node root) {
        if (root == null) {
            return -1;
        } else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Levels of the tree:");
        printLevels(root);
        System.out.println("Height of the tree: " + height(root));
    }
}
