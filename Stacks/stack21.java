package Stacks;

import java.util.Stack;
public class stack21 {

    public static String postfixToPrefix(String inputString){

        Stack<String> sO = new Stack<String>();
        for(String s : inputString.split("")){
            //operand
            if(Character.isLetterOrDigit(s.charAt(0))) sO.push(s);
            //operator
            else{
                String o2 = sO.pop();
                String o1 = sO.pop();
                String toPush = s + o1 + o2;
                sO.push(toPush);
            }
        }
        return sO.pop();

    }   
    public static void main(String args [] ){

        System.out.println("\nPostfix to prefix conversion using stack");
        String input = "ABC/-AK/L-*";
        String result = postfixToPrefix(input);

        System.out.println("\nPrefix expression is : " + result);
        
    }
}
