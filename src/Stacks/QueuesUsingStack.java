package Stacks;

import java.util.Stack;

public class QueuesUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;
    public QueuesUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }
    public void add(int val) {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        first.push(val);
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }
    public int remove(int val) throws Exception {
        while(!first.isEmpty()) {
            second.push(first.pop());
        }
        int removedElement = second.pop();
        while(!second.isEmpty()) {
            first.push(second.pop());
        }
        return removedElement;
    }

    public int peek() throws Exception {
        while(!first.isEmpty()) {
            second.push(first.pop());
        }
        int element = second.peek();
        while(!second.isEmpty()) {
            first.push(second.pop());
        }
        return element;
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }
}
