package DoublyLinkedLists;

import java.util.Scanner;
public class dll02{

    public static void main(String args []){

        System.out.println("\nAll variations of insertions in a Dll\n");

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

        //define scanner object
        Scanner scan = new Scanner(System.in);

        //insertion at head
        System.out.println("\nEnter value to insert at head");
        int insertAtHead = scan.nextInt();

        System.out.println("List after insertion at head");
        dllObject.insertAtHead(insertAtHead);
        dllObject.printDll();

        //insertion at end
        System.out.println("\nEnter value to insert at end");
        int insertAtEnd = scan.nextInt();

        System.out.println("List after insertion at end");
        dllObject.insertAtEnd(insertAtEnd);
        dllObject.printDll();

        //insertion after a node
        System.out.println("\nEnter value to insert after node(n4)");
        int insertAfterNode = scan.nextInt();

        System.out.println("List after insertion after node(n4)");
        dllObject.insertAfterNode(n4, insertAfterNode);
        dllObject.printDll();

        //insertion before a node
        System.out.println("\nEnter value to insert before node(n5)");
        int insertBeforeNode = scan.nextInt();

        System.out.println("List after insertion before node(n5)");
        dllObject.insertBeforeNode(n5, insertBeforeNode);
        dllObject.printDll();

        scan.close();
    }   
}
