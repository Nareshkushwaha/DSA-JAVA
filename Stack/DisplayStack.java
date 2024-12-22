package Stack;

import java.util.*;

public class DisplayStack {
    public static void display(Stack<Integer> st) {
        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
            int x = st.peek();
          //  System.out.print(x + " ");
            rt.push(x);
            st.pop();
        }
        Stack<Integer> gt = new Stack<>();
        while (rt.size() > 0) {
            int x = rt.peek();
            System.out.print(x + " ");
            gt.push(x);
            rt.pop();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        display(st);
    }
}