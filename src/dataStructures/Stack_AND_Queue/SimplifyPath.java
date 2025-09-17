package dataStructures.Stack_AND_Queue;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/home/user/Documents/../Pictures";
        System.out.println(simplifyPath(path));
    }
    public static String simplifyPath(String path) {
        String[] tokens = path.split("/");
        Stack<String> stack = new Stack<>();

        for(String token: tokens){
            if(token.equals("") || token.equals(".")){
                continue;
            }else if(token.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(token);
            }
        }
        StringBuilder sb = new StringBuilder();

        for(String word : stack){
            sb.append("/").append(word);
        }
        return sb.length() == 0? "/" : sb.toString();
    }
}
