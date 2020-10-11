package Stacks;

public class stack8 {
    public static void main(String args){

        System.out.println("\nReverse a stack using recursion and standard stack operations\n");

        //create stack object
        StackDynamic stackObject = new StackDynamic();

        //push elements onto stack
        stackObject.push(11);
        stackObject.push(22);
        stackObject.push(33);
        stackObject.push(44);
        stackObject.push(55);
        stackObject.push(66);

        System.out.println("\nTraverse the stack");
        stackObject.printStack();

        


    }
}
