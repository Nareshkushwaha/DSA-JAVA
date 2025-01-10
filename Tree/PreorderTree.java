package Tree;

import java.util.Scanner;

public class PreorderTree{
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

    public static void preOrderTraversal(Node root) {
        if (root == null)
            return;
        
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        Node a = createTree();
        System.out.println("Preorder Traversal:");
        preOrderTraversal(a);
    }
}
