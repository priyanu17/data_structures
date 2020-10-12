package Stacks;

import java.util.Scanner;

public class stack12 {
    public static void main(String args [] ){


        System.out.println("\nSort a stack using temporary stack\n");

        //create stack object
        StackDynamic stackObject = new StackDynamic();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of elements in the stack");
        int lengthOfStack = scan.nextInt();

        System.out.println("Enter "+ lengthOfStack+ " elements to push");

        int i = 0;
        while( i++<lengthOfStack){
            int value = scan.nextInt();
            stackObject.push(value);
        }
        scan.close();

        System.out.println("\nDisplay stack before sorting (using temp stack)");
        stackObject.printStack();

        //create new temp stak to pass
        StackDynamic tempStack = new StackDynamic();
        //sort the stack
        stackObject = StackDynamic.sortStackUsingTempStack(stackObject, tempStack);

        System.out.println("\nDisplay stack after sorting (using temp stack)");
        stackObject.printStack();
    }
}
