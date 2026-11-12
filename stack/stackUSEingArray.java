package stack;
public class StackUSEingArray{
    int[] stack = new int[5];
    int top = -1;
    public void push(int value){
        if(top == stack.length-1){
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack[top] = value;
    }
    public void pop(){
        if(top == -1){
            System.err.println("stack underflow");
            return;
        }
        System.out.println(stack[top] + " " +"popped");
        top--;
    }
    public void peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("TOP element:" + " " + stack[top]);
    }
    public void isfull(){
        if(top==stack.length-1){
            System.out.println("stack is full");
        }
        else{
            System.out.println("Stack is not full");
        }
    }
    public void display(){
        if(top==-1){
            System.out.println("stack is empty");
            return;
        }
        for(int i = top; i>=0; i--){
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args){
        StackUSEingArray s = new StackUSEingArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();
        s.pop();
        System.out.println("After popped");
        s.display();
        s.peek();
        s.isfull();

    }
}
