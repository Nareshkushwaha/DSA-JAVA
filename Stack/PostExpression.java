package Stack;

import java.util.*;
public class PostExpression{
    public static void main(String[] args) {
        String infix="9-(5+3)*4/6";
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                String s=""+ch;
                val.push(s);
            }
            else if(ch=='(' || op.size()==0 || op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    //work 
                    String v2=val.pop();//3 
                    String v1=val.pop();//5 
                    char o=op.pop();//+ 
                    //v1 + v2+op 
                    String t=v1+v2+o; //+53 
                    val.push(t);
                }
                op.pop();//remove opening bracket 
            }
            else{
                if(ch=='+' || ch=='-'){
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=op.pop();
                    String t=v1+v2+o;
                    val.push(t);
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        String v2=val.pop();
                        String v1=val.pop();
                        char o=op.pop();
                        String t=v1+v2+o;
                        val.push(t);
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }
        while(val.size()>1){
            String v2=val.pop();
            String v1=val.pop();
            char o=op.pop();
            String t=v1+v2+o;
            val.push(t);
        }
        String prefix=val.pop();
        System.out.println(prefix); 
    }
}