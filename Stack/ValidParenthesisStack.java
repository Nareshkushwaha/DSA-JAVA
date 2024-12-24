package Stack;

import java.util.*;

public class ValidParenthesisStack {
    public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        // loop
        for (int i = 0; i < s.length(); i++) {
            // charAt :predefine method :string every element one by one read krta hai
            // without converting array
            char ch = s.charAt(i);
            // opening
            if (ch == '(') {
                st.push(ch);
            }
            // when ch value become close then remove opening bracket
            else {
                if (st.size() == 0) {
                    return false;
                }
                // if for pop opening bracket
                if (st.peek() == '(') {
                    st.pop();
                }
            }
        }
        if (st.size() > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string ");
        String s = sc.next();
        boolean n = isBalanced(s);
        System.out.println(n);

        // another :if keyword work on boolean
        if (isBalanced(s)) {
            System.out.println("valid parenthis");
        } else {
            System.out.println("this is not valid parenthesis");
        }
    }
}
