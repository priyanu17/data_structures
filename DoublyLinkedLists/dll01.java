package DoublyLinkedLists;

public class dll01 {
    public static void main(String args [] ){


        System.out.println("\nCreate and traverse a manual Dll");

        //create dll object
        DLL dllObject = new DLL();

        //create nodes
        DLL.Node n1 = new DLL.Node(11);
        DLL.Node n2 = new DLL.Node(22);
        DLL.Node n3 = new DLL.Node(33);
        DLL.Node n4 = new DLL.Node(44);
        DLL.Node n5 = new DLL.Node(55);
        DLL.Node n6 = new DLL.Node(66);

        //create link to head

        dllObject.head = n1;

        //create next links
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        //create previous links

        n6.prev = n5;
        n5.prev = n4;
        n4.prev = n3;
        n3.prev = n2;
        n2.prev = n1;

        System.out.println("\nTraversing the doubly linked list");

        dllObject.printDll();
    }
}











