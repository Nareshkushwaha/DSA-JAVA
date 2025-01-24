package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindSecondMax {
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
            System.out.println(); 
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return -1;
        } else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static int findMax(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE; 
        }

        int maxValue = root.data;
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);

        return Math.max(maxValue, Math.max(leftMax, rightMax));
    }

    public static Integer findSecondMax(Node root) {
        if (root == null) {
            return null; // No second maximum if tree is empty
        }

        Integer[] maxValues = new Integer[2]; // Array to hold max and second max
        findMaxAndSecondMax(root, maxValues);
        return maxValues[1]; // Return the second maximum
    }

    private static void findMaxAndSecondMax(Node root, Integer[] maxValues) {
        if (root == null) {
            return;
        }

        // Update maxValues array
        if (maxValues[0] == null || root.data > maxValues[0]) {
            maxValues[1] = maxValues[0]; // Update second max
            maxValues[0] = root.data; // Update max
        } else if (root.data != maxValues[0] && (maxValues[1] == null || root.data > maxValues[1])) {
            maxValues[1] = root.data; // Update second max
        }

        // Recur for left and right children
        findMaxAndSecondMax(root.left, maxValues);
        findMaxAndSecondMax(root.right, maxValues);
    }

    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("Levels of the tree:");
        printLevels(root);
        System.out.println("Height of the tree: " + height(root));
        System.out.println("Maximum element in the tree: " + findMax(root));
        System.out.println("Second maximum element in the tree: " + findSecondMax(root));
    }
}
