package Stack;
import java.util.*;

public class Duplice_paranthesis {
    public static boolean isDuplicate(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({[]})";
        if (isDuplicate(s)) {
            System.out.println("No Duplicate");
        } else {
            System.out.println("Duplicate");
        }
    }
}   
