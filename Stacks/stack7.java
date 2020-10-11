package Stacks;

import java.util.Scanner;

public class stack7 {
    public static void main(String[] args) {
        
        System.out.println("\nView stack after multiple pop operations\n");

        //create stack object
        StackDynamic stackObject = new StackDynamic();

        //push elements onto stack
        stackObject.push(11);
        stackObject.push(22);
        stackObject.push(33);
        stackObject.push(44);
        stackObject.push(55);
        stackObject.push(66);

        System.out.println("\nTraverse the stack before any pop\n");
        stackObject.printStack();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of times to perform pop");

        int popCount = scan.nextInt();
        for(int i=1; i<= popCount && stackObject.root!= null ; i++){
            System.out.println("Perform " + i + " pop operation");
            stackObject.pop();
            stackObject.printStack();

        }
        scan.close();
    }
}
