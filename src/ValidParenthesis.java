import java.util.Stack;

class ValidParenthesis {

    public static void main(String[] args)
    {
        System.out.println(isValid("({}[]{}){}"));
        System.out.println(isValid("["));
        System.out.println(isValid("[(])"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stk.push(s.charAt(i));
            } else {
                if (s.charAt(i) == ')') {
                    if (!stk.empty() && stk.pop() == '(') {
                        continue;
                    } else {
                        return false;
                    }

                } else if (s.charAt(i) == ']') {
                    if (!stk.empty() && stk.pop() == '[') {
                        continue;
                    } else {
                        return false;
                    }
                } else if (s.charAt(i) == '}') {
                    if (!stk.empty() && stk.pop() == '{') {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        }
        return stk.empty();
    }
}