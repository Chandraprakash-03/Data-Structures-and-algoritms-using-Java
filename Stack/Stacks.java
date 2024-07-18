package Stack;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        // System.out.println(stack.isEmpty());
        stack.push("RDR");
        stack.push("GTA");
        stack.push("DOOM");

        System.out.println(stack.peek());

        // System.out.println(stack);
    }

}
