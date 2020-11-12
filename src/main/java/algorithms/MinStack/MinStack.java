package algorithms.MinStack;

import java.util.Stack;

/**
 * @Author : Wu.D.J
 * @Create : 2020.11.02
 *
 * https://leetcode-cn.com/problems/min-stack/solution/155-zui-xiao-zhan-3chong-jie-jue-fang-shi-by-sdwwl/
 */
public class MinStack {

    private final Stack<Node> stack = new Stack<>();

    public void push(int x) {
        int minValue = stack.isEmpty() ? x : Math.min(x, getMin());
        stack.push(new Node(x, minValue));
    }

    public void pop() { stack.pop(); }

    public int top() { return stack.peek().val; }

    public int getMin() { return stack.peek().min; }

    class Node {
        int val, min;
        public Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }
}

class MinStack2 {
    private final Stack<Integer> valueStack = new Stack<>();
    private final Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        valueStack.push(x);
        if (minStack.isEmpty() || x <= getMin()) minStack.push(x);
    }

    public void pop() {
        if (valueStack.pop() == getMin()) minStack.pop();
    }

    public int top() { return valueStack.peek(); }

    public int getMin() { return minStack.peek(); }
}

class MinStack3 {
    private int min;
    private Stack<Integer> stack = new Stack<>();

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(0);
            min = x;
        } else {
            stack.push(x - min);
            if (x < min) min = x;
        }
    }

    public void pop() {
        int pop = stack.pop();
        if (pop < 0) min -= pop;
    }

    public int top() {
        int peek = stack.peek();
        return peek > 0 ? peek + min : min;
    }

    public int getMin() { return min; }
}

