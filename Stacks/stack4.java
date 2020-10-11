package Stacks;

public class stack4 {
    public static void main(String args [] ){

        System.out.println("\nFetch top element of stack\n");

        //create Stack object
        StackStatic stackObject = new StackStatic();

        stackObject.push(11);
        stackObject.push(22);
        stackObject.push(33);
        stackObject.push(44);

        stackObject.printStack();
        System.out.println("Top element of stack is : "+ stackObject.peek());

        //push another element
        stackObject.push(55);

        stackObject.printStack();
        System.out.println("Top element of stack is : "+ stackObject.peek());

    }
}
