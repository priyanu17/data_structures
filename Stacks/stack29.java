package Stacks;

import java.util.Stack;

public class stack29 {

    public static int findMaximumDepth(String input){

        Stack<String> stack = new Stack<String>();
        int finalCount = 0;
        int count = 0;
        String [] sArr = input.split("");
        for(int i=0; i< sArr.length ; i++){
           if(sArr[i].equals("(")) {
               stack.push(sArr[i]);
                count++;
            }
            else if(sArr[i].equals(")")) {

                if(!stack.isEmpty() && stack.peek().equals("(")) {
                    stack.pop();
                    count--;
                }
                else return -1;
            }
            else 
            continue;

            if(count > finalCount) finalCount = count;

        }
        if(stack.isEmpty()) return finalCount;
        else return -1;
    }
    public static void main(String args [] ){


        System.out.println("\nFind maximum depth of a nested parethesis using stacks (Method 2)\n");
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
