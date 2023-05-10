// https://leetcode.com/problems/valid-parentheses/

import java.util.ArrayList;

public class ValidParentheses {

    static public boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        }
        ArrayList<Character> closedParentheses = new ArrayList<>();
        for (Character character : s.toCharArray()) {
            switch (character) {
                case '(':
                    closedParentheses.add(')');
                    break;
                case '[':
                    closedParentheses.add(']');
                    break;
                case '{':
                    closedParentheses.add('}');
                    break;
                default:
                    if (!closedParentheses.contains(character)) {
                        return false;
                    } else {
                        closedParentheses.remove(character);
                        break;
                    }
            }
        }
        return true;
    }
}
