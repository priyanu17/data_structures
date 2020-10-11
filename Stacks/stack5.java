package Stacks;

public class stack5 {
    public static void main(String args [] ){

        System.out.println("\nCreate and implement dynamic stack using linked list\n");
        System.out.println("Push and pop operations on stacks");

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

        //pop elements
        stackObject.pop();
        stackObject.pop();

        System.out.println("\nStack after pop operations");
        stackObject.printStack();
    }
}
