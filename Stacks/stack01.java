package Stacks;

public class stack01 {
    public static void main(String args []){

        System.out.println("\nPush and pop operations on stacks using arrays\n");
        //create stack objects
        StackStatic stackObject = new StackStatic();

        //push elements
        stackObject.push(11);
        stackObject.push(22);
        stackObject.push(33);
        stackObject.push(44);
        stackObject.push(55);
        stackObject.push(66);

        System.out.println("Printing stack after pushing elements");
        stackObject.printStack();

        //pop elements
        stackObject.pop();
        stackObject.pop();
        stackObject.pop();

        System.out.println("Stack after pop operations");
        stackObject.printStack();
    }
}
