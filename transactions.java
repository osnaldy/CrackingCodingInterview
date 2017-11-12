import java.util.HashMap;
import java.util.Stack;

public class transactions {

    public static void main(String[] args) {


        Stack stack = new Stack();
        Stack stack1 = new Stack();

        stack.push(20);
        stack.push(13);
        stack.push(11);
        stack.push(18);

        stack1.push(18);
        stack1.push(33);
        stack1.push(11);
        stack1.push(20);

        HashMap<Integer, Integer> map = new HashMap<>();


        while (!stack.isEmpty()) {

            map.put((int)stack.pop(), 1);
        }

        while (!stack1.isEmpty()) {

            int i = (int)stack1.pop();

            if (map.get(i) != null){

                System.out.println("found transaction " + i);
            }
        }
    }
}


