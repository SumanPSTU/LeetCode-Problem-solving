package DSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalanceParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(new BalanceParenthesis().isValid(str));
    }
    public boolean isValid(String string){
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i<string.length();i++){
            char ch = string.charAt(i);
            if (ch=='('){
                stack.push(ch);
            }else {
                if (stack.size()==0) return false;
                if (stack.peek()=='(') stack.pop();
            }
        }
        if (stack.size()>0) return false;
        return true;
    }
}
