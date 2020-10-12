package Stacks;

import java.util.Scanner;

public class stack13 {
    public static void main(String ar [] ){
        System.out.println("\nDelete middle element of stack\n");

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

        System.out.println("\nDisplay stack before deleting middle element");
        stackObject.printStack();

        //create middleNode and endNode to pass
        StackDynamic.StackNode midNode = stackObject.root;
        StackDynamic.StackNode endNode = stackObject.root;

        StackDynamic.deleteMiddleElement(stackObject, midNode, endNode);

        System.out.println("\nDisplay stack after deleting middle element");
        stackObject.printStack();
    }
}
