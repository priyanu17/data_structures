package Stacks;

import java.util.Stack;
public class stack22 {

    public static String reverseString(String s){
        char [] charArray = s.toCharArray();
        for(int left=0, right = s.length()-1; left<right; left++, right--){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
        }
        return String.valueOf(charArray);
    }

    public static String prefixToPostfix(String inputString){

        Stack<String> sO = new Stack<String>();
        for(String s : reverseString(inputString).split("")){
            //operand
            if(Character.isLetterOrDigit(s.charAt(0))) sO.push(s);
            //operator
            else{
                String o1 = sO.pop();
                String o2  = sO.pop();
                String toPush = o1 + o2 + s;
                sO.push(toPush);
            }
        }
        return sO.pop();

    }   
    public static void main(String args [] ){

        System.out.println("\nPrefix to Postfix conversion using stack");
        String input = "*-A/BC-/AKL";
        String result = prefixToPostfix(input);

        System.out.println("\nPostfix expression is : " + result);
        
    }
}
