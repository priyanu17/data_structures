package Stacks;

import java.util.Stack;

public class stack32 {

    public static String markUnbalanced(String s){
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(') stack.push(i);
            else if(s.charAt(i) == ')' && !stack.isEmpty() ) {
                int open = stack.pop();
                s = s.substring(0, open) + "0" + s.substring(open+1);
                s = s.substring(0, i) + "1" + s.substring(i+1);
            }
        }
        for(int i=0; i<s.length(); i++)
            if(s.charAt(i) == '(' || s.charAt(i) == ')') 
                s = s.substring(0, i) + "*" + s.substring(i+1);
        return s;
    }
    public static void main(String args [] ){
        System.out.println("\nIdentify and mark unmatched parenthesis using stacks\n");
        String input, result ;

        input = "";
        result = markUnbalanced(input);
        System.out.println("Input String is : " + input);
        System.out.println("Result String is : " + result + "\n");

        input = "((a)";
        result = markUnbalanced(input);
        System.out.println("Input String is : " + input);
        System.out.println("Result String is : " + result + "\n");

        input = "(a))";
        result = markUnbalanced(input);
        System.out.println("Input String is : " + input);
        System.out.println("Result String is : " + result + "\n");

        input = "(((abc))((d)))))";
        result = markUnbalanced(input);
        System.out.println("Input String is : " + input);
        System.out.println("Result String is : " + result + "\n");

    }
}
