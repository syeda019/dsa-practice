package stack;
// using array
public class ReverseStringUA {
    char[] stack = new char[100];
    int top = -1;

    public void push(char value){
        if(top == stack.length -1){
            System.out.println("stack overflow");
            return;
        }
        top++;
        stack[top] = value;
    }

    public char pop(){
        if(top == -1){
            System.out.println("stack is empty");
            return '\0';
        }
        char value = stack[top];
        top--;
        return value;
    }  
    public String Reverse(String str){
        for(char i = 0; i < str.length(); i++ ){
            push(str.charAt(i));
        }
        String reversed=" ";
        while(top!=-1){
            reversed = reversed + pop(); 
        }
        return reversed;

    }
    public void display(){
        if(top == -1){
            System.out.println("stack empty");
            return;
        }
        for(int i=top; i>=0; i--){
            System.out.print(stack[i]);
        }
    }
    public static void main(String[] args) {
        ReverseStringUA list = new ReverseStringUA();
        list.push('f');
        list.push('a');
        list.push('t');
        list.push('i');
        list.push('m');
        list.push('a');
        list.display();
        list.Reverse("fatima");

    }
}
