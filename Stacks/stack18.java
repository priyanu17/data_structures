package Stacks;

import java.util.Stack;

public class stack18 {

    public static String reverseString(String s){
        char [] charArray = s.toCharArray();
        for(int left=0, right = s.length()-1; left<right; left++, right--){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
        }
        return String.valueOf(charArray);
    }

    public static int precedenceLevel(char c){
        if(c == '^') return 2;
        else if(c == '*' || c == '/' ) return 1;
        else if(c == '+' || c == '-') return 0;
        return -1;
    }

    public static String infixToPrefix(String inputString){

        String ans = "";
        Stack<Character> sO = new Stack<Character>();        
        for(char s : reverseString(inputString).toCharArray()){
            //space
            if(s == ' ') continue;
            //operand
            else if(Character.isLetterOrDigit(s)) ans += s;
            //closing parenthesis
            else if(s == ')' || s == '}'  || s == ']') sO.push(s);
            //opening parenthesis
            else if(s == '(' ){
                while(!sO.isEmpty() && sO.peek() != ')') ans += sO.pop();
                sO.pop();
            }
            else if(s == '{' ){
                while(!sO.isEmpty() && sO.peek() != '}') ans += sO.pop();
                sO.pop();
            }
            else if(s == '[' ){
                while(!sO.isEmpty() && sO.peek() != ']') ans += sO.pop();
                sO.pop();
            }
            //operator
            else if(s=='+' || s=='-' || s=='*' || s == '/' || s=='^'){
                while(!sO.isEmpty() && precedenceLevel(s) <= precedenceLevel(sO.peek())) ans += sO.pop();
                sO.push(s);
            }
            //invalid input
            else{
                return "Invalid input in the infix expression";
            }
        }

        while(!sO.isEmpty()) ans += sO.pop();
        return reverseString(ans);
    }
    public static void main(String args [] ){

        System.out.println("\nInfix to Prefix conversion using stacks");

        String inputString = "A * B + C / D";
        String result = infixToPrefix(inputString);
        System.out.println("\nPrefix expression is \n"+ result);

        inputString = "(A - B/C) * (A/K-L)";
        result = infixToPrefix(inputString);
        System.out.println("\nPrefix expression is \n"+ result);
    }
}
