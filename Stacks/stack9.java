package Stacks;

import java.util.*;

public class stack9 {
    public static void main(String args [] ){

        System.out.println("\nReverse a string and linked list using stack\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter String to reverse : ");
        String inputString = scan.nextLine();

        int length = inputString.length();
        System.out.println("Input string has " + length + " characters");

        //create a dynamic stack
        StackDynamic stackObj = new StackDynamic();

        for(int i=0; i<length; i++){
            int val = inputString.charAt(i);
            stackObj.push(val);
        }
        String ans = "";
        for(int j=0; j<length; j++){
            ans += (char)stackObj.pop();
        }
        System.out.println("\nString after reversal using stack");
        System.out.println(ans);

        System.out.println("Whether stack is empty : "+ stackObj.isEmpty());
        scan.close();
    }   
}
