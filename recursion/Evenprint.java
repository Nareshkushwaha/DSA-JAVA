package recursion;

public class Evenprint{
    public static void even(int start,int end){
         if(start>end){
             return;
         }
          if(start%2==0){
              System.out.println(start+" ");
          }
           even(start+1,end);
    }
    
     public static void main(String args[]){
          int start=1;
          int end=5;
          even(start,end);
     }
}

