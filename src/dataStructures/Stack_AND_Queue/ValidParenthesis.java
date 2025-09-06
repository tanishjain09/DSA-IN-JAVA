package dataStructures.Stack_AND_Queue;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '{' || c == '[' || c == '(' ){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                char ch = stack.pop();
                if( (c == '}' && ch == '{') || (c == ')' && ch == '(') || (c == ']' && ch == '[')) continue;
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
