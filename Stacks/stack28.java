package Stacks;

import java.util.Stack;

public class stack28 {

    public static int findMaximumDepth(String input){

        Stack<String> stack = new Stack<String>();
        int finalCount = 0;
        int count = 0;
        for(String s : input.split("")){
            
            //opening parenthesis
            if(s.equals("(")) {
                stack.push(s);
                count = 0;
            }
            //closing parenthesis
            else if(s.equals(")")) {
                if(!stack.isEmpty() && stack.peek().equals("(")) count ++;
                else return -1;
            }
            //other input
            else continue;
            if(count > finalCount) finalCount = count;
        }
        return finalCount;
    }
    public static void main(String args [] ){


        System.out.println("\nFind maximum depth of a nested parethesis using stacks\n");
        String inputString;

        inputString = "( ((X)) (((Y))) )";
        System.out.println("Input string is : " + inputString);
        System.out.println("Maximum depth of parenthesis is : " + findMaximumDepth(inputString) + "\n");

        inputString = "( a(b) (c) (d(e(f)g)h) I (j(k)l)m)";
        System.out.println("Input string is : " + inputString);
        System.out.println("Maximum depth of parenthesis is : " + findMaximumDepth(inputString) + "\n");

        inputString = "( p((q)) ((s)t) )";
        System.out.println("Input string is : " + inputString);
        System.out.println("Maximum depth of parenthesis is : " + findMaximumDepth(inputString) + "\n");

        inputString = "";
        System.out.println("Input string is : " + inputString);
        System.out.println("Maximum depth of parenthesis is : " + findMaximumDepth(inputString) + "\n");

        inputString = "b) (c) ()";
        System.out.println("Input string is : " + inputString);
        System.out.println("Maximum depth of parenthesis is : " + findMaximumDepth(inputString) + "\n");

        inputString = "(b) ((c) ()";
        System.out.println("Input string is : " + inputString);
        System.out.println("Maximum depth of parenthesis is : " + findMaximumDepth(inputString) + "\n");

    }
}
