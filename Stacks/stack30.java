package Stacks;

import java.util.Stack;
public class stack30 {

    public static int findLongestValidSubstring(String inputString){
        int count = 0;

        Stack<String> stack = new Stack<String>();
        for(String s : inputString.split("")){
            if(s.equals("(")) stack.push(s);
            else if(s.equals(")") && !stack.isEmpty() && stack.peek().equals("(")) {
                stack.pop();
                count++;
            }
            else continue;
        }
        return count*2;
    }
    public static void main(String args [] ){
        System.out.println("\nFind the length of the longest valid substring using stacks\n");

        String inputString;
        int result;
        inputString = "((()";
        result = findLongestValidSubstring(inputString);
        System.out.println("Input string is : " + inputString) ;
        System.out.println("Length of longest valid substring is : " + result + "\n");

        inputString = ")()())";
        result = findLongestValidSubstring(inputString);
        System.out.println("Input string is : " + inputString) ;
        System.out.println("Length of longest valid substring is : " + result + "\n");

        inputString = "()(()))))";
        result = findLongestValidSubstring(inputString);
        System.out.println("Input string is : " + inputString) ;
        System.out.println("Length of longest valid substring is : " + result + "\n");

    }
}
 