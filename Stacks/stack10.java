package Stacks;

import LinkedLists.LinkedList;
import java.util.Scanner;

public class stack10 {
    public static void main(String args [] ){

        System.out.println("\nReverse a linked list using stacks\n");

        //create a linked list object
        LinkedLists.LinkedList llObject = new LinkedLists.LinkedList();

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter length of linked list");
        int lengthOfLL = scan.nextInt();

        System.out.println("Enter " + lengthOfLL + " elements to insert into linked list");
        for(int k=0; k<lengthOfLL; k++ ){
            int val = scan.nextInt();
            llObject.insertAtEnd(val);
        }
        scan.close();
        System.out.println("LL before reversal");
        llObject.printList();

        //create a stack object
        StackDynamic stackObj = new StackDynamic();

        //get length of linked list
        int lengthOfList = LinkedList.findLengthIterative(llObject);

        for(int i=0; i<lengthOfList; i++){
            stackObj.push(llObject.deleteFromHead());
        }

        System.out.println("\nLength of Linked List after all push : " + LinkedList.findLengthIterative(llObject));

        for(int j=0; j<lengthOfList; j++){
            llObject.insertAtEnd(stackObj.pop());
        }
        System.out.println("LL after reversal");
        llObject.printList();
    }
}
