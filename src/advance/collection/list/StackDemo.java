package advance.collection.list;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10); // Adds elements
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        System.out.println(stack.peek()); // Returns top element without removing it

        stack.pop(); // Removes the top element
        System.out.println(stack);

    }
}
