package stack;

public class balancedParenthesesUL {
    class Node{
        char data;
        Node next;
        Node(char data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void push(char data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }
    public char pop(){
        if(head == null){
            System.out.println("stack underflow");
            return '\0';
        }
        char value = head.data;
        head = head.next;
        return value;
    }
    public boolean isBalanced(String str){
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);

            if(ch=='(' || ch =='{' || ch=='['){
                push(ch);
            }
            else if(ch==')' || ch=='}' || ch== ']'){
                if(head == null){
                    return false;
                }
                char value = pop();
                if(ch==')'&& value !='('){
                    return false;
                }
                if(ch=='}'&& value !='{'){
                    return false;
                }
                if(ch==']'&& value !='['){
                    return false;
                }
            }
        }
        return head == null;
    }
    public static void main(String[] args){
        balancedParenthesesUL list = new balancedParenthesesUL();
        String str = "[{()}]";
        if(list.isBalanced(str)){
            System.out.println("balanced");
        }
        else{
            System.out.println("Not balanced");
        }
    }
}
