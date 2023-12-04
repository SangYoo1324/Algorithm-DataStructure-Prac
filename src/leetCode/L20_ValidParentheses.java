package leetCode;

import java.util.Stack;

public class L20_ValidParentheses {
    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();

        System.out.println(solution20.isValid("{}"));
    }
}

class Solution20 {
    public boolean isValid(String s) {
        if(s.length()%2 !=0) return false;
        Boolean validity = true;

        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();

        for(char c: chars){
            if(c == '(' || c == '{' || c == '['){
            System.out.println("새로운 bracket: "+c );
            stack.push(c);
            }else if(c == ')' && !stack.isEmpty()){
                if(stack.peek() =='('){
                    System.out.println(" (가 클로즈됬습니다");
                    stack.pop();
                    continue;
                }else{
                    return false;
                }
            }else if(c == ']' && !stack.isEmpty()){
                if(stack.peek()=='['){
                    System.out.println("[ 가 클로즈됬습니다");
                    stack.pop();
                }else{
                    return false;
                }

            }
            else if(c == '}' && !stack.isEmpty()){
                if(stack.peek()=='{'){
                    System.out.println("{ 가 클로즈됬습니다");
                    stack.pop();
                }else{
                    return false;
                }

            }
            else return false;
        }

        return validity;
    }
}