package stack;

public class infixTOpostfixUL {
    class Node{
        char data;
        Node next;
        Node(char data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public boolean isEmpty(){
        return head == null;
    }
    public void push(char data){
        Node newNode = new Node(data);
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        newNode.next = head;
        head = head.next;

    }
    public char pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return '\0';
        }
        char value = head.data;
        head = head.next;
        return value;
    }
    public char peek(){
        if(isEmpty()){
            System.out.println("stack empty");
            return '\0';
        }
        return head.data;
    }
    // operator
    public int operator(char ch){
        if(ch== '+' || ch == '-'){
            return 1;
        }
        if(ch== '*' || ch== '/'){
            return 2;
        }
        return 0;
    }
    public String convert(String exp){
        String result = "";
        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result = result + ch;
            }
            else if(ch == '('){
                push(ch);
            }
            else if(ch == ')'){
                while(head!= null && peek()!='('){
                    result = result + pop();
                }
                pop();
            }
            else{
                 while (head != null && (ch) <= (peek())) {
                    result = result + pop();
                }
                push(ch);
            }
        }
        while(head != null){
            result = result + pop();
        }
        return result;
    }
    public static void main(String[] args){
        infixTOpostfixUL p = new infixTOpostfixUL();
        p.push('A');
        p.push('+');
        p.push('B');
        p.push('*');
        p.push('C');
        String exp = "A+B*c";
        String postfix = p.convert(exp);
        System.out.println("Infix: " + exp);
        System.out.println("Postfix: " + postfix);

    }
    
}
