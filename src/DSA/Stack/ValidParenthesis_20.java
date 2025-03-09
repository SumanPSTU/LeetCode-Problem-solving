package DSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        str = scanner.next();
        System.out.println(new ValidParenthesis_20().isValid(str));
    }
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (Character c :s.toCharArray()){
            if (c=='(' || c=='{' || c=='[') {
                stack.push(c);

            }else if (c == ')' || c == '}' || c == ']'){
                if (stack.isEmpty()  || !check(stack.pop(),c)) return false;
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
    private static boolean check(char open, char close){
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
    }
}