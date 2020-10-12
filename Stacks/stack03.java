package Stacks;

public class stack03 {
    public static void main(String args [] ){

        System.out.println("\nStack underflow with pop operations\n");

        //create Stack object
        StackStatic stackObject = new StackStatic();

        System.out.println("Pop operation on empty stack");
        stackObject.pop();

        stackObject.push(11);
        stackObject.push(22);
        stackObject.push(33);
        stackObject.push(44);

        System.out.println("\nStack after pushing elements");
        stackObject.printStack();

        System.out.println("Performing pop operation");
        int popElement = stackObject.pop();

        System.out.println("\nStack after pop operation");
        stackObject.printStack();

        System.out.println("Element poped from stack is : " + popElement);
    }   
}
