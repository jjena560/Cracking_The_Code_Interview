
import java.util.*;

class SortStack {
    // stack

    public static Stack<Integer> sortstack(Stack<Integer> input) {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while (!input.isEmpty()) {
            int item = input.pop();
            while (!tmpStack.isEmpty() && item < tmpStack.peek()) {

                input.push(tmpStack.pop());
            }
            tmpStack.push(item);
        }

        while (!input.isEmpty()) {
            tmpStack.push(input.pop());
        }

        return tmpStack;
    }

    public static void main(String args[]) {
        Stack<Integer> input = new Stack<Integer>();
        Stack<Integer> input1 = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        // these values are just to show the unsorted values
        input1.add(34);
        input1.add(3);
        input1.add(31);
        input1.add(98);
        input1.add(92);
        input1.add(23);

        System.out.println("Unsorted numbers are:");
        while (!input1.empty()) {
            System.out.print(input1.pop() + " ");
        }

        Stack<Integer> tmpStack = sortstack(input);
        System.out.println("\nSorted numbers are:");

        while (!tmpStack.empty()) {
            System.out.print(tmpStack.pop() + " ");
        }
    }
}