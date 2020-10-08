package LinkedLists;

import java.util.Scanner;

public class linkedList10 {
    
    public static void main(String ar [] ){
        System.out.println("\nReverse a linked list\n");

        LinkedList llObject = new LinkedList();

        System.out.println("Enter number of nodes in the linked list");

        Scanner scan = new Scanner(System.in);
        int lengthOfList = scan.nextInt();

        System.out.println("Enter "+ lengthOfList+ " elements in the list");

        for(int i=1; i<=lengthOfList;i++){
            int val = scan.nextInt();
            llObject.insertAtEnd(val);
        }
        System.out.println("\nThe list is as follows");
        llObject.printList();

        llObject = LinkedList.reverseList(llObject);

        System.out.println("\nList after reversal ");
        llObject.printList();
        scan.close();
    }
}
