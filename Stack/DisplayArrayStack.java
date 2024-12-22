package Stack;

import java.util.*;

public class DisplayArrayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int x = st.size();
        int a[] = new int[x];
        for (int i = x - 1; i >= 0; i--) {
            a[i] = st.pop();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}