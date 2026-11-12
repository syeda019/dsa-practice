package stack;

public class matchingParenthesesUA {
    char[] stack = new char[50];
    int top = -1;

    public void push(char value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        stack[top] = value;
    }

    public char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return '\0';
        }

        char value = stack[top];
        top--;
        return value;
    }

    public boolean isMatching(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                push(ch);
            }

            else if (ch == ')' || ch == '}' || ch == ']') {

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

        return top == -1;
    }

    public static void main(String[] args) {
        matchingParenthesesUA list = new matchingParenthesesUA();

        String str = "{(A+B)*[C-D]}";

        if (list.isMatching(str)) {
            System.out.println("Parentheses are matching");
        } else {
            System.out.println("Parentheses are not matching");
        }
    }
}
