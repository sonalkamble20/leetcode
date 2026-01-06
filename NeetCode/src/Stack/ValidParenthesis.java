//Valid Parentheses
//You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.
//The input string s is valid if and only if:
//    Every open bracket is closed by the same type of close bracket.
//    Open brackets are closed in the correct order.
//    Every close bracket has a corresponding open bracket of the same type.
//Return true if s is a valid string, and false otherwise.package Stack;
package Stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args)
    {
        System.out.println(isValid("[(])"));
    }

    public static boolean isValid(String s)
    {
        Stack<Character> valid = new Stack<>();

        char top = ' ';
        for (char c : s.toCharArray())
        {
            switch(c)
            {
                case '(':
                case '{':
                case '[': valid.push(c);
                break;
                case ')':
                case '}':
                case ']': if(valid.isEmpty())  return false;
                          else  top = valid.pop();
                          if(top == '(' && c != ')') return false;
                          else if(top == '{' && c != '}') return false;
                          else if(top == '[' && c != ']')  return false;
            }
        }
        return valid.isEmpty();
    }
}
