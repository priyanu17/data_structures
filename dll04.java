
public class dll04 {
    public static void main(String args []){

        System.out.println("\nTraverse the dll in reverse Order\n");

        //create dll object
        DLL dllObject = new DLL();

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

        System.out.println("Traverse list in opposite order");
        dllObject.traverseInReverseOrder();
    }
}
