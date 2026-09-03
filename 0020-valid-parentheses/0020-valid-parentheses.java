import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if ((open == '(' && c != ')') ||
                    (open == '[' && c != ']') ||
                    (open == '{' && c != '}')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}