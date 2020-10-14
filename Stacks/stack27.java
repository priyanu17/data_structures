package Stacks;

import java.util.Stack;
import java.util.Scanner;

public class stack27 {
    public static void main(String[] args) {
        
        System.out.println("\nReverse a string using stacks\n");

        System.out.println("Enter string to reverse : ");
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        Stack<String> stack = new Stack<String>();
        for(String s : inputString.split("")) stack.push(s);
        String resultString = "";
        while(!stack.isEmpty()) resultString += stack.pop();

        System.out.println("\nReverse of string is : " + "\n" + resultString);

        scan.close();
    }
}
