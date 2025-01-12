 package Tree;
import java.util.Scanner;

public class TreeHeight{
    static Scanner sc = new Scanner(System.in);

    static class Node {
        Node right, left;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    static Node createtree() {
        Node root = null;
        System.out.println("Enter data (-1 to stop):");
        int data = sc.nextInt();

        if (data == -1)
            return null;
        root = new Node(data);
        System.out.println("Enter left data for " + data);
        root.left = createtree();

        System.out.println("Enter right data for " + data);
        root.right = createtree();

        return root;
    }

    public static void postOrderTraversal(Node root) {
        if (root == null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static int height(Node root) {
        if (root == null)
            return -1; 
        else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1; 
        }
    }

    public static void main(String[] args) {
        Node a = createtree();
        System.out.print("Post-order traversal: ");
        postOrderTraversal(a);
        System.out.println();
        System.out.println("Height of the tree: " + height(a));
    }
}
