package LinkedLists;

import java.util.Scanner;

public class linkedList07 {
    public static void main(String ar[]){
        //create a linked list

        LinkedList llObject = new LinkedList();

        llObject.insertAtEnd(11);
        llObject.insertAtEnd(22);
        llObject.insertAtEnd(33);
        llObject.insertAtEnd(44);
        llObject.insertAtEnd(55);
        llObject.insertAtEnd(66);
        llObject.insertAtEnd(77);
        llObject.insertAtEnd(88);
        llObject.insertAtEnd(99);
        llObject.insertAtEnd(100);

        llObject.printList();

        //using Double Pointers

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter position from end of list");
        int position = scan.nextInt();
        scan.close();

        LinkedList.Node nthNodeFromEnd = llObject.NthNodeFromEnd(position); 

        System.out.println("\nPosition "+ position + " from the end of the list is : "+ nthNodeFromEnd.data);

        System.out.println("\nProgram completed");


    }
}
