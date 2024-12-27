package Queue;

import java.util.*;
public class QueueCopy {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        //copy queue ---->another queue 
        Queue<Integer> q1=new LinkedList<>();
        while(q.size()>0){
            //find every time element peek:not possible
            q1.add(q.remove());
        }
        System.out.println(q1);

        //arraydequeue
        Queue<Integer> q2=new ArrayDeque<>();
        while(q1.size()>0){
            //peek() :used for find every time peek element in queue
            q2.add(q1.poll());
        }
        System.out.println(q2);
    }
}