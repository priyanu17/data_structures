package Stacks;

public class stack02 {
    public static void main(String args []){

        System.out.println("\nChecking stack overflow with push operation\n");

        //create stack object
        StackStatic stackObject = new StackStatic();

        //Stack underflow
        System.out.println("Printing an empty stack");
        stackObject.printStack();

        System.out.println("\nPush elements onto the stack until full");

        int i;
        for(i=0; i<1000; i++){
            stackObject.push(i);
        }
        if(stackObject.top == stackObject.ar.length)
        System.out.println("\nStack is full");
        
        //stack overflow
        System.out.println("Now push one more element");
        stackObject.push(i);

    }
}
