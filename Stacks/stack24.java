package Stacks;

import java.util.Stack;

public class stack24 {

    public static boolean isBalanced(String inputString){

        Stack<String> sO = new Stack<String>();
        for(String s : inputString.split("")){
            if(s.equals("(") || s.equals("{") || s.equals("[")) sO.push(s);
            else if (s.equals(")") && !sO.isEmpty() && sO.peek().equals("(")) sO.pop();
            else if (s.equals("}") && !sO.isEmpty() && sO.peek().equals("{")) sO.pop();
            else if (s.equals("]") && !sO.isEmpty() && sO.peek().equals("[")) sO.pop();
            else sO.push(s);
        }
        return sO.isEmpty();
    }
    public static void main(String args []   ){

        System.out.println("\nCheck for balanced parenthesis");
        String inputString;
        inputString = "[()]{}{[()()]()}";
        System.out.println("\nString is : " + inputString);
        System.out.println("Is the expression balanced ?\nAnswer : " + isBalanced(inputString));

        inputString = "[(])";
        System.out.println("\nString is : " + inputString);
        System.out.println("Is the expression balanced ?\nAnswer : " + isBalanced(inputString));

    }
}
