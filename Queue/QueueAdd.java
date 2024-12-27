package Queue;

public class QueueAdd {
    public static class Queue{
        int f=-1;
        int r=-1;
        int size=0;
        int a[]=new int[5];
        public void add(int val){
            if(r==a.length-1){
                System.out.println("full");
                return;
            }
            if(f==-1){
               f=r=0;
               a[r]=val;
            }
            else{
                a[++r]=val;
            }
            size++;
        }
        public  void display(){
           for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
           }
        }
    }
    public static void main(String[] args){
        Queue q=new Queue();
        q.add(56);
        q.add(67);
        q.add(12);
        q.add(1);
        q.add(23);
        q.display();
    }
}