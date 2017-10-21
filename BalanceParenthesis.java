import java.util.Stack;

public class BalanceParenthesis {

    public boolean isValid(char [] parethesis)
    {
        Stack stack = new Stack();

        for (int i = 0; i < parethesis.length; i++)
        {

            if (parethesis[i] == '(' || parethesis[i] == '{' || parethesis[i] == '[') {

                stack.push(parethesis[i]);
            }
            if (parethesis[i] == ')' || parethesis[i] == '}' || parethesis[i] == ']') {

                if (stack.isEmpty()) {
                    return false;
                }
                else {
                    char holder = (char)stack.pop();

                    if ((holder != '(' && parethesis[i] == ')') || (holder != '{' && parethesis[i] == '}') || (holder != '[' && parethesis[i] == ']')) {

                        return false;
                    }
                }
            }
        }

        if (stack.isEmpty()) {

            return true;
        }
        else {

            return false;
        }
    }

    public static void main(String[] args) {

        BalanceParenthesis bp = new BalanceParenthesis();

        String s = "{}{{}{}";

        char [] sc = s.toCharArray();

        System.out.println(bp.isValid(sc));
    }
}
