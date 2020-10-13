package Stacks;

import java.util.Stack;

public class stack19 {

    public static String postfixToInfix(String inputString){
        Stack<String> sO = new Stack<String>();
        for(String s : inputString.split("")){
            //operand
            if(Character.isLetterOrDigit(s.charAt(0))) sO.push(s);
            //operator
            else{
                String o2 = sO.pop();
                String o1 = sO.pop();
                String toPush = "(" + o1 + s + o2 + ")";
                sO.push(toPush); 
            }
        }
        return sO.pop();

    }
    public static void main(String args [] ){


        System.out.println("\n PostFix to Infix conversion using stack\n");

        String inputString = "abcd^e-fgh*+^*+i-";
        //output string
        String result = postfixToInfix(inputString);
        System.out.println("\nInfix expression is \n"+ result);

    }
}
