package Stacks;

import java.util.Scanner;

public class stack6 {
    public static void main(String[] args) {
        System.out.println("\nView stack after each push operation\n");

        
        //create stack object
        StackDynamic stackObject = new StackDynamic();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements to push");
        int length = scan.nextInt();


        for(int i=1; i<=length; i++){
            System.out.println("Enter element to push onto stack");
            int val = scan.nextInt();
            stackObject.push(val);
            System.out.println();
            stackObject.printStack();
        }

        scan.close();
    }


}
