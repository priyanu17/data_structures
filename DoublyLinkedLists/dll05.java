package DoublyLinkedLists;

public class dll05 {
    public static void main(String args []){

        System.out.println("\nReverse of a Doubly Linked List\n");

        //create dll object
        DLL dllObject = new DLL();

        //insert elements;
        dllObject.insertAtEnd(11);
        dllObject.insertAtEnd(22);
        dllObject.insertAtEnd(33);
        dllObject.insertAtEnd(44);
        dllObject.insertAtEnd(55);
        dllObject.insertAtEnd(66);
        dllObject.insertAtEnd(77);
        dllObject.insertAtEnd(88);
        dllObject.insertAtEnd(99);

        System.out.println("Traverse the doubly linked list");
        dllObject.printDll();

        //reverse the list
        dllObject.reverseDll();

        System.out.println("\nDll after reversing the list");
        dllObject.printDll();

        //checking on empty list
        System.out.println("\nChecking on empty list");

        DLL dllObject2 = new DLL();

        dllObject2.reverseDll();
        dllObject2.printDll();
        System.out.println("\nSuccessful on an empty list");

    }
}
