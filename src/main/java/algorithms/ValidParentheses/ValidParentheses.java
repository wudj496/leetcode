package algorithms.ValidParentheses;

import java.util.*;

/**
 * @Author : Wu.D.J
 * @Create : 2020.11.02
 */
public class ValidParentheses {

    // 暴力解法：一直replace匹配的括号对

    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (map.containsValue(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !map.get(c).equals(stack.pop())) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        if (s.isEmpty()) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (c == '(') stack.push(')');
            else if (stack.isEmpty() || c != stack.pop()) return false;
        }
        return stack.isEmpty();
    }
}
