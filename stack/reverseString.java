package stack;
// using array
public class reverseString {
    char[] stack = new char[5];
    int top = -1;

    public void push(char value){
        if(top == stack.length -1){
            System.out.println("stack overflow");
            return;
        }
        top++;
        stack[top] = value;
    }

    public void pop(){
        if(top == -1){
            System.out.println();
            return;
        }
        System.out.println(stack[top] + "popped");
        top--;
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
        reverseString list = new reverseString();
        list.push('f');
        list.push('a');
        list.push('t');
        list.push('i');
        list.push('m');
        list.push('a');
        list.display();
        list.pop();

    }
}
