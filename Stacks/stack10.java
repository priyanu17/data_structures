package Stacks;

import LinkedLists.LinkedList;

public class stack10 {
    public static void main(String args [] ){

        System.out.println("\nReverse a linked list using stacks\n");

        //create a linked list object
        LinkedLists.LinkedList llObject = new LinkedLists.LinkedList();

        llObject.insertAtEnd(1);
        llObject.insertAtEnd(2);
        llObject.insertAtEnd(3);
        llObject.insertAtEnd(4);
        llObject.insertAtEnd(5);
        llObject.insertAtEnd(6);

        System.out.println("LL before reversal");
        llObject.printList();

        //create a stack object
        StackDynamic stackObj = new StackDynamic();

        //get length of linked list
        int lengthOfList = LinkedList.findLengthIterative(llObject);

        for(int i=0; i<lengthOfList; i++){
            stackObj.push(llObject.deleteFromHead());
        }

        System.out.println("Length of Linked List after all push " + LinkedList.findLengthIterative(llObject));

        for(int j=0; j<lengthOfList; j++){
            llObject.insertAtEnd(stackObj.pop());
        }
        System.out.println("LL after reversal");
        llObject.printList();
    }
}
