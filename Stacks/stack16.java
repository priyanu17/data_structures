package Stacks;

import java.util.Scanner;
public class stack16 {
    public static void main(String ars [] ){


        System.out.println("\nCheck for balanced parenthesis in string expressions\n");

        //get String input
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the string to check balancing");
        String inputString = scan.nextLine();

        //create Stack object
        StackDynamic sO = new StackDynamic();
        
        System.out.println("( : " + (int)'(');    
        System.out.println(") : " + (int)')');    
        System.out.println("[ : " + (int)'[');    
        System.out.println("] : " + (int)']');    
        System.out.println("{ : " + (int)'{');    
        System.out.println("} : " + (int)'}');    

        for(char c : inputString.toCharArray()){
            int n = (int)c;
            if(n == 40 || n == 91 || n == 123) sO.push(n);
            else if(sO.peek() == 40 && n == 41) sO.pop();
            else if(sO.peek() == 91 && n == 93) sO.pop();
            else if(sO.peek() == 123 && n == 125) sO.pop();
            else sO.push(n);
        }
        System.out.println("****");

        sO.printStack();

        System.out.println("\nIs the expression balanced ? \nAnswer : "+ sO.isEmpty());
        scan.close();

    }
}
