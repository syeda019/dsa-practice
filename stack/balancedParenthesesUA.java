package stack;

public class balancedParenthesesUA {
    char[] stack = new char[50];
    int top = -1;
    public void push(char value){
        if(top == stack.length-1){
            System.out.println("stack overflow");
            return;
        }
        top++;
        stack[top]=value;
    }

    public char pop(){
        if(top == -1){
            System.out.println("stack underflow");
            return '\0';
        }
        char value = stack[top];
        top--;
        return value;
    }
    public void dispaly(){
        if(top==-1){
            System.out.println("stack is empty:");
            return;
        }
        for(int i=top; i>=0; i--){
            System.out.println(stack[i]);
        }
    }
    public  boolean isBalanced(String str){

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[' ){
                push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']'){
                // Stack empty
                if (top == -1) {
                    return false;
                }

                char value = pop();

                if (ch == ')' && value != '(') {
                    return false;
                }

                if (ch == '}' && value != '{') {
                    return false;
                }

                if (ch == ']' && value != '[') {
                    return false;
                }

            }
        }
        // Stack empty means balanced
        return top == -1;     
    }
    
    
    public static void main(String[] args){
        balancedParenthesesUA list = new balancedParenthesesUA();
        String str = "[{()}]";
        if(list.isBalanced(str)){
            System.out.println("balanced");
        }
        else{
            System.out.println("Not balanced");
        }
    }  
}
