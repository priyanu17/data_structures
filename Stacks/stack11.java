package Stacks;

import java.util.Scanner;

public class stack11 {
    public static void main(String args [] ){
        

        System.out.println("\nSort a stack using ADT stack functions\n");

        //create stack object
        StackDynamic stackObject = new StackDynamic();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of elements in the stack");
        int lengthOfStack = scan.nextInt();

        System.out.println("Enter "+ lengthOfStack+ " elements to push");

        int i = 0;
        while( i++<lengthOfStack){
            System.out.println("Enter value to push to stack");
            int value = scan.nextInt();
            stackObject.push(value);
        }
        scan.close();

        System.out.println("\nDisplay stack before sorting");
        stackObject.printStack();

        //sort the stack
        StackDynamic.sortStack(stackObject);

        System.out.println("\nDisplay stack after sorting");
        stackObject.printStack();
    }
}
