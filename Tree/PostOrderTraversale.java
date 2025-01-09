package Tree;
import java.util.Scanner;

public class PostOrderTraversale {
     static Scanner sc=new Scanner(System.in);
    static class Node{
        Node right,left;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    static Node createtree(){
        Node root=null;
        System.out.println("enter data");
        int data=sc.nextInt();

        if(data==-1)
            return null;
        root=new Node(data);
        System.out.println("enter left data "+data );
        root.left=createtree();
       
        System.out.println("enter right data "+data);
        root.right=createtree();
       
        return root;
    }
    public static void postOrderTraversal(Node root){
        if(root==null)
         return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        Node a=createtree();
        postOrderTraversal(a);
    }
}








