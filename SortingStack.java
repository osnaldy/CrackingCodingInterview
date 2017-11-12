import java.util.Stack;

public class SortingStack {

    public static void main(String[] args) {

        Stack stack = new Stack();
        Stack stack1 = new Stack();

        stack.push(32);
        stack.push(12);
        stack.push(24);
        stack.push(21);
        stack.push(3);
        stack.push(17);
        int temp;


        while (!stack.isEmpty()) {

            temp = (int)stack.pop();

            while (!stack1.isEmpty() && temp < (int)stack1.peek()) {

                stack.push(stack1.pop());
            }

            stack1.push(temp);
        }
        System.out.println(stack1);
    }
}
