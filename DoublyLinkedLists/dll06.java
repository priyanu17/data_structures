package DoublyLinkedLists;

import java.util.Scanner;

public class dll06 {
    public static void main(String args [] ){


        System.out.println("\nDelete all occurences of an element in a DLL");

        DLL dllObject = new DLL();

        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter number of nodes in the dll");
        int lengthOfList = scan.nextInt();

        System.out.println("Enter " + lengthOfList + " elements in the dll");
        for(int i=0; i<lengthOfList; i++){
            int val = scan.nextInt();
            dllObject.insertAtEnd(val);
        }


        System.out.println("Enter element to delete from dll");
        int elementToDelete = scan.nextInt();

        dllObject.deleteElement(elementToDelete);

        System.out.println("\nDll after deleting the required element");
        dllObject.printDll();

        scan.close();

    }
}














