package stack;

import java.util.Stack;

public class Reverse {
    public static void pushBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

         int top = s.pop();
         pushBottom(data, s);    //Recursion case
         s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();    // top sa remove karna start kara ga
        reverse(s);          // Recursive case   // ya sara data ko remove kara ga 
        pushBottom(top, s);  // ya again add kara ga
    }

    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
         s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
    
}
