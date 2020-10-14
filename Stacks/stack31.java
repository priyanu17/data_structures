package Stacks;

import java.util.Stack;

public class stack31 {

    public static int reversals(String inputString){

        Stack<String> stack = new Stack<String>();

        for(String s : inputString.split("")){
            if (s.equals("}") && !stack.isEmpty() && stack.peek().equals("{")) stack.pop();
            else stack.push(s);
        }
        int count , countOpen, countClose;
        count = countOpen = countClose = 0;
        while(!stack.isEmpty()) {
            if(stack.peek().equals("}")) countClose++;
            else countOpen ++;
            stack.pop();
            count++;
        }

        if(count%2 != 0) return -1;
        else return ((++countOpen/2) + (++countClose/2));
    }
    public static void main(String args [] ){

        System.out.println("\nNumber of bracket reversals needed for balanced expression\n");

        String inputString;
        int result;

        inputString = "}{";
        result = reversals(inputString);
        System.out.println("String is : " + inputString);
        System.out.println("Number of reversals is : " + result);

        inputString = "{{{";
        result = reversals(inputString);
        System.out.println("String is : " + inputString);
        System.out.println("Number of reversals is : " + result);

        inputString = "{{{{";
        result = reversals(inputString);
        System.out.println("String is : " + inputString);
        System.out.println("Number of reversals is : " + result);

        inputString = "{{{{}}";
        result = reversals(inputString);
        System.out.println("String is : " + inputString);
        System.out.println("Number of reversals is : " + result);

        inputString = "}{{}}{{{";
        result = reversals(inputString);
        System.out.println("String is : " + inputString);
        System.out.println("Number of reversals is : " + result);

        inputString = "}}{{";
        result = reversals(inputString);
        System.out.println("String is : " + inputString);
        System.out.println("Number of reversals is : " + result);
    

    }
}
