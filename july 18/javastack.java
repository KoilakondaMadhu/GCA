import java.util.*;

public class Main {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        for (char c : s.toCharArray()) {
            if (mapping.containsKey(c)) {
                // Closing parenthesis encountered
                if (stack.isEmpty() || stack.peek() != mapping.get(c)) {
                    return false;
                }
                stack.pop();
            } else {
                // Opening parenthesis encountered
                stack.push(c);
            }
        }

        return stack.isEmpty(); // If the stack is empty, the string is balanced
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String s = scanner.next();
            System.out.println(isBalanced(s) ? "true" : "false");
        }
    }
}
