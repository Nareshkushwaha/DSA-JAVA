package Stack;

import java.util.*;

public class ValidParenthesis {
    public static void isBalanced(String s) {
        int countOpen = 0;
        int countClose = 0;
        char a[] = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '(') {
                countOpen++;
            }
            if (a[i] == ')') {
                countClose++;
            }
        }
        if (countClose == countOpen) {
            System.out.println("valid parenthesis");
        } else {
            System.out.println("invalid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string ");
        String s = sc.next();
        isBalanced(s);
    }
}