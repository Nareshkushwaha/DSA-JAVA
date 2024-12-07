package recursion;

public class StringRecurssion {
    public static void printn(char a[],int index){
        if(a.length ==index){
            return ;
        }
        System.out.print(a[index]);
        printn(a,index+1);
    }
     public static void main(String[] args) {
         String s="hello";
         //char ---> array 
         char a[]=s.toCharArray();
         printn(a,0);
     }
 }