package recursion;

public class Numberprint{
    int starting=0;
    int ending=0;
     public static void printnum(int n){
         if(n==0){
              return ;
         }
         printnum(n-1);
         {
              System.out.println(n);
         }
     }
     
     public static void main(String args[]){
          printnum(10);
     }
}