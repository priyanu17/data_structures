package Stacks;

import java.util.Stack;

public class stack17 {

    public static int precedenceLevel(char c){
        if(c == '^') return 2;
        else if(c == '*' || c == '/' ) return 1;
        else if(c == '+' || c == '-') return 0;
        return -1;
    }
    public static String infixToPostfix(String inputString){

        String ans = "";
        Stack<Character> sO = new Stack<Character>();
        for(char s : inputString.toCharArray()){

            //operand 
            if(Character.isLetterOrDigit(s)) ans += s;

            //opening parenthesis
            else if (s == '(' || s == '{' || s == '[') sO.push(s);

            //closing parenthesis
            else if (s == ')'){ 
                while(!sO.isEmpty() && sO.peek() != '(') ans += sO.pop();
                sO.pop();
            }
            else if(s == '}'){
                while(!sO.isEmpty() && sO.peek() != '{') ans += sO.pop();
                sO.pop();
            }
            else if(s == ']'){
                while(!sO.isEmpty() && sO.peek() != '[') ans += sO.pop();
                sO.pop();
            }
            //operator
            else if (s == '+' || s == '-' || s == '*' || s == '/' || s == '^'){
                while(!sO.isEmpty() && precedenceLevel(s) <= precedenceLevel(sO.peek())){
                    ans += sO.pop();
                }
                sO.push(s);
            }
            //Invalid input
            else {
                System.out.println(s);
                return "Invalid Input in the infix expression";
            }
        }

        while(!sO.isEmpty() ) ans += sO.pop();
        return ans;
    }
    public static void main(String args [] ){
        System.out.println("\nInfix to Postfix conversion using stack\n");
        //input string
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        //output string
        String result = infixToPostfix(s);
        System.out.println("\nPostfix expression is \n"+ result);
    }
}