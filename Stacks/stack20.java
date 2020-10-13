package Stacks;

import java.util.Stack;
public class stack20 {

    public static String reverseString(String s){
        char [] charArray = s.toCharArray();
        for(int left=0, right = s.length()-1; left<right; left++, right--){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
        }
        return String.valueOf(charArray);
    }

    public static String prefixToInfix(String inputString){

        Stack<String> sO = new Stack<String>();
        for(String s : reverseString(inputString).split("")){
            //operand
            if(Character.isLetterOrDigit(s.charAt(0))) sO.push(s);
            //operator
            else{
                String o1 = sO.pop();
                String o2 = sO.pop();
                String toPush = "(" + o1 + s + o2 + ")";
                sO.push(toPush);
            }

        }
        return sO.pop();
    }
    public static void main(String args [] ){

        System.out.println("\nPrefix to Infix conversion using stack");
        String inputString = "*-A/BC-/AKL";
        //output string
        String result = prefixToInfix(inputString);
        System.out.println("\nInfix expression is \n"+ result);
    }
}
