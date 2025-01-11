package Tree;

import java.util.Scanner;

public class InorderTree {
    static Scanner sc = new Scanner(System.in);

    static class Node {
        Node right, left;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    static Node createTree() {
        Node root = null;
        System.out.println("Enter data (-1 to stop):");
        int data = sc.nextInt();

        if (data == -1)
            return null;
        
        root = new Node(data);
        System.out.println("Enter left data for " + data + ":");
        root.left = createTree();

        System.out.println("Enter right data for " + data + ":");
        root.right = createTree();

        return root;
    }

    public static void inOrderTraversal(Node root) {
        if (root == null)
            return;

        inOrderTraversal(root.left); // Visit left subtree
        System.out.print(root.data + " "); // Visit root
        inOrderTraversal(root.right); // Visit right subtree
    }

    public static void main(String[] args) {
        Node a = createTree();
        System.out.println("Inorder Traversal:");
        inOrderTraversal(a);
    }
}
