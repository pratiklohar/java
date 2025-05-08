package advance.collection.list;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10); // Push elements onto the stack
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);

        stack.pop(); // Pop the top element from stack.

        System.out.println(stack);

        System.out.println(stack.peek()); // Get the top element of the stack.

        System.out.println(stack.isEmpty()); // Check if the stack is empty

        System.out.println(stack.size()); // Get the size of the stack

        System.out.println(stack.search(20)); // Search for an element in the stack

        System.out.println(stack.contains(30)); // Check if the stack contains an element

        stack.clear(); // Clear the stack

        System.out.println(stack);

    }
}
