

public class push {

    int[] stack = new int[5];
    int top = -1;

    // Push: element add karna
    public void Push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        stack[top] = value;
        System.out.println(value + " pushed");
    }
    public void display(){
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
    public static void  main(String[] args){
        push p = new push();
        p.Push(10);
        p.Push(20);
        p.Push(30);
        p.Push(40);

        p.display();

    }

    
}
