import java.util.Stack;

class StackMin {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minVals = new Stack<Integer>();

    public void push(int val) {
        if (minVals.isEmpty() || minVals.peek() >= val) {
            minVals.push(val);
        }
        stack.push(val);
    }

    public void pop() {
        if (minVals.peek().equals(stack.peek())) {
            minVals.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minVals.peek();
    }

    // Driver program
    public static void main(String[] args) {

        StackMin ks = new StackMin();

        ks.push(15);
        ks.push(45);

        int minVal = ks.getMin();
        System.out.print(minVal);

    }
}
