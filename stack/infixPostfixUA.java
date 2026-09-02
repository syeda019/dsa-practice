package stack;
public class infixPostfixUA{

    char[] stack = new char[100];
    int top = -1;

    // Push
    public void push(char value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        stack[top] = value;
    }

    // Pop
    public char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return '\0';
        }

        char value = stack[top];
        top--;

        return value;
    }

    // Peek
    public char peek() {
        if (top == -1) {
            return '\0';
        }

        return stack[top];
    }

    // Check precedence
    public int precedence(char ch) {

        if (ch == '+' || ch == '-') {
            return 1;
        }

        if (ch == '*' || ch == '/') {
            return 2;
        }

        return 0;
    }

    // Infix to Postfix
    public String convert(String expression) {

        String result = "";

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                result = result + ch;
            }

            // Opening bracket
            else if (ch == '(') {
                push(ch);
            }

            // Closing bracket
            else if (ch == ')') {

                while (top != -1 && peek() != '(') {
                    result = result + pop();
                }

                pop();   // remove '('
            }

            // Operator
            else {

                while (top != -1 && precedence(ch) <= precedence(peek())) {
                    result = result + pop();
                }

                push(ch);
            }
        }

        // Pop remaining operators
        while (top != -1) {
            result = result + pop();
        }

        return result;
    }

    public static void main(String[] args) {

        infixPostfixUA obj = new infixPostfixUA();

        String expression = "A+B*C";

        String postfix = obj.convert(expression);

        System.out.println("Infix: " + expression);
        System.out.println("Postfix: " + postfix);
    }
}