package Recursion_Basic_Adv;

import java.util.Stack;

public class ReverseStack {
    static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        insertAtBottom(s,top);
    }
    static void insertAtBottom(Stack<Integer> s,int element){
        if(s.isEmpty()){
            s.push(element);
            return;
        }
        int top = s.pop();
        insertAtBottom(s,element);
        s.push(top);
    }
}
