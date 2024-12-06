package LinkedList;

public class NodeCreat{
    static class Node{
         int data;
         Node Next;
         
         Node(int data){
             this.data=data;
         }
    }
     public static void main(String args[]){
          Node a=new Node(1);
          Node b=new Node(2);
          Node c=new Node(3);
          Node d=new Node(4);
          System.out.println(a.data+" ");
          System.out.println(b.data+" ");
          System.out.println(c.data+" ");
          System.out.println(d.data+" ");
     }
}